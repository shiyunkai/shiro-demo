package com.example.shirodemo.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.example.shirodemo.entity.UserSexEnum;

import java.io.UnsupportedEncodingException;
import java.util.Date;

/**
 * @Auther: shiyunkai
 * @Date: 2019/03/27 15:04
 * @Description: JWT工具类
 */
public class JWTUtil {
    // 缓存过期时间24小时
    private static final long EXPIRE_TEME = 1 * 60 * 1000;

    // 密钥
    private static final String SCRET = "SHIRO+JWT";

    /* * @Auther: shiyunkai
     * @Description: 根据用户名创建token, 过期时间为创建后的1分钟
     * @Param: [username]
     * @Date:  15:07 2019/3/27
     * @return: java.lang.String
     **/
    public static String createToken(String username) {

        try {
            Date date = new Date(System.currentTimeMillis() + EXPIRE_TEME);
            Algorithm algorithm = null;
            algorithm = Algorithm.HMAC256(SCRET);
            String token = JWT.create()
                    .withClaim("username", username)////payload
                    .withExpiresAt(date)
                    .sign(algorithm);//指定签名算法
            return token;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* * @Auther: shiyunkai
     * @Description: 获取token中用户名
     * @Param: [token]
     * @Date:  15:24 2019/3/27
     * @return: java.lang.String
     **/
    public static String getUsername(String token) {
        DecodedJWT decode = JWT.decode(token);
        return decode.getClaim("username").asString();
    }

    /* * @Auther: shiyunkai
     * @Description: 检查token是否和某个用户名关联
     * @Param: [token, username]
     * @Date:  15:19 2019/3/27
     * @return: boolean
     **/
    public static boolean verifyToken(String token, String username) {

        Algorithm algorithm = null;

        try {
            algorithm = Algorithm.HMAC256(SCRET);
            JWTVerifier verifier = JWT.require(algorithm)
                    .withClaim("username", username)
                    .build();
            // 验证token 验证不通过时会抛出异常
            DecodedJWT verify = verifier.verify(token);
            return true;//正确
        } catch (Exception e) {
            return false;
        }

    }
}
