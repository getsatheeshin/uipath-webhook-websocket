package com.uipath.app;

import javax.crypto.KeyGenerator;
import javax.crypto.KeyGeneratorSpi;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

import static java.nio.charset.StandardCharsets.UTF_8;import java.nio.charset.StandardCharsets;

public class HmacUtils {

    String generateHmac256(String message, byte[] key) throws InvalidKeyException, NoSuchAlgorithmException {
        byte[] bytes = hmac("HmacSHA256", key, message.getBytes());
        /*System.out.println(new String(bytes, StandardCharsets.UTF_8));
        return bytesToHex(bytes);  */ 
        
        /*Base64.getDecoder().encode(
        		"+r8tw7b8L631PCNCTrikQodmWg+yvJX3+z+TVS9SUqM=".getBytes()), StandardCharsets.UTF_8*/
        
        return new String(bytes, StandardCharsets.UTF_8);
    }

    byte[] hmac(String algorithm, byte[] key, byte[] message) throws NoSuchAlgorithmException, InvalidKeyException {
        Mac mac = Mac.getInstance(algorithm);
        mac.init(new SecretKeySpec(key, algorithm));
        return mac.doFinal(message);
    }

    /*String bytesToHex(byte[] bytes) {   
        final char[] hexArray = "0123456789abcdef".toCharArray();
        char[] hexChars = new char[bytes.length * 2];
        for (int j = 0, v; j < bytes.length; j++) {
            v = bytes[j] & 0xFF;
            hexChars[j * 2] = hexArray[v >>> 4];
            hexChars[j * 2 + 1] = hexArray[v & 0x0F];
        }
        return new String(hexChars);
    }*/

     /*public static void main(String[] args) throws NoSuchAlgorithmException, InvalidKeyException {
        String valueToDigest = "{\"Type\":\"queueItem.transactionStarted\",\"EventId\":\"c04ab851cae64bff870dbfb02064cfc1\",\"Timestamp\":\"2021-01-21T16:22:48.0817413Z\",\"QueueItem\":{\"Id\":19051,\"Key\":\"59ae69c3-f239-48e2-8a4c-41b4f97b0614\",\"Reference\":\"CheckRef\",\"QueueDefinitionId\":145,\"Status\":\"InProgress\",\"ReviewStatus\":\"None\",\"Priority\":\"Normal\",\"CreationTime\":\"2021-01-12T15:53:07.577Z\",\"StartProcessing\":\"2021-01-21T16:22:46.71Z\",\"SecondsInPreviousAttempts\":0,\"RetryNumber\":0,\"Robot\":{\"Id\":42,\"Name\":\"Sujith-Laptop\",\"MachineId\":26,\"MachineName\":\"MAA-LT3KKFZW2\",\"Version\":\"19.10.2.0\",\"UserName\":\"fnfis\\\\e3016428\",\"Type\":\"Development\",\"HostingType\":\"Standard\"},\"SpecificContent\":{}},\"TenantId\":3,\"OrganizationUnitId\":3,\"UserId\":82}";
        byte[] key = "secret-text".getBytes();

        HmacUtils hm = new HmacUtils();
        String messageDigest = hm.generateHmac256(valueToDigest, key);
        System.out.println(messageDigest);
        
        String signatureFromHeader = new String(Base64.getDecoder().decode(
        		"+r8tw7b8L631PCNCTrikQodmWg+yvJX3+z+TVS9SUqM=".getBytes()), StandardCharsets.UTF_8);
        System.out.println(signatureFromHeader);
        
        System.out.println(signatureFromHeader.equals(messageDigest));
        
        //KeyGeneratorSpi generatorSpi = KeyGenerator.
        		
        		KeyGenerator generator = KeyGenerator.getInstance("HmacSHA256");
        		System.out.println(new String(generator.generateKey().getEncoded(), StandardCharsets.UTF_8));
        
        
    }*/
}
