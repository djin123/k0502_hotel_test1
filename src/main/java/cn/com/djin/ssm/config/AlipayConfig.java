package cn.com.djin.ssm.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：  ksfxhw3818@sandbox.com   111111
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2021000118642164";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCCue/rILyDCMEBJOEHXAOgW+PfGbS8GEp9tLuyi61NnVCBu/p5SVibEZ4U/U/s89U3bvyKZpUzBv1NVshoJks02/EWUg7rQgLFhQPQEnxGwYSTjabkWn8lcOa4VvgPk1czo1xSdoCewRuR7s5j5+iPA86DKXhMRn6qJvM4DeYb7XzqJ3aUVJqCS8kwqSjpRdUz9Oh/PHTGYiY9hcs4KHkLW0gi/yyTjQmm7kB4pjEAgasZAZwZuxvUB83fvnkO50/pHxYzXBhaz/J76c2yIr6TaNSduwkeB40kA+bQ0cPJTxkHtRp5TcotHsPPObzk6KCCGThGCpBVmt172WjpWx51AgMBAAECggEAKGwoZNNdl0MYsyrdLnJkaKyhXLZNLbBxMEe3lnEcaJiRcVxYCjME5AZhlGnz0fhf4OE/0+f+kKXDo6uHErVsoe60sMs088gYpU0JLcjZhuOGBD5T8d6N3Fz56txxnhdYao5EGPets+lQhiKKzVfDkJ2DuQkUurk9p42dvaKGmfG3Z75W17g0Yl3vrVxkVtQ0kc1o0xlN4FvAWjhADdKOeOPJ/HD4w93f+m2Mn+eykIqOpqIJ5fe/kVv6KtIkw8NsNe8f/cQKqc3VlFJCnhXWv5JQyKNmUb/BrOitXC12ChO/DKfQks9ZI+gwzRxaMMk4WyPa+pmCru9b/aDDIG6loQKBgQC+uT3/qrLizdeAvJNff5kNe0nsI/0XSZ9vXzfDDOOH81qpD3z/b+b0vnaHYByWeInI7VBslOyksG0HASRgMu6mtteBoGE4/nrdFSh9UIWB5QukUgkFNCMF0a6X33U86N+LxhdZI2ARPxL2S5Yh/AmtJnDvKRS+fUBYv7KhXHzC/QKBgQCvd99jjweslLrMOHVRg4omLONlJnRFWcXgSoVVhILTQzPi2OgEk/UQEOKoUGHbAUcc4no24i272/IMh0GPcVy/3hD7rtWgSbfdptRti7AMkieSQyDNyytRAW3zgn/1Z8JRsD3lYZolRs+zUq+NQIYAp9eOK36DgTAf1qHwH7AO2QKBgGqa8GSv7T2JASQcQ+PlVo+Kkk9D7nvN0yhVeL21vpiHFe3ZkmzVB6tVqrsQpeoVhi6hN4r50yxa0RZRNRvwXCUjnmH+W1mYJOTeprsk/vsUI+W9VP1rnwfppEWPyeA56noeR36zn0cEknzI0yo7zszR595GgCnZqNXykM5Q/AuhAoGAJ7P7Av8BIIbCwaTgvuIBp2OuzFtoIa0PfhG+m7wREhZ5rhGgZjDIWatIbgdKLRDb82g3eSWybXh2C2mrZvaiovNvalOEGPG1Pd0a4fKikiWb+Jdh287l7T1ikJ/triydJni3eKieBWNBafUCrfZ0m79eoderl7vqlLmvCLNS1fkCgYAp9hwzG+6sgj20Rh0po4BojO/pFmogeNZp9xig3UAXonaWaOrMA/hnF+Ru2sMYJEodZe0SsEBTSVwYxRvDZLuhSz1sKXcx+u8Ip7lWH5VG4ANJoE924x2kJ9YgEjTpLGoGV5ALZdy3cHIXS8dEUq1X85f/lQM5IS7WsZO1+IUoCg==";
    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAgrnv6yC8gwjBASThB1wDoFvj3xm0vBhKfbS7soutTZ1Qgbv6eUlYmxGeFP1P7PPVN278imaVMwb9TVbIaCZLNNvxFlIO60ICxYUD0BJ8RsGEk42m5Fp/JXDmuFb4D5NXM6NcUnaAnsEbke7OY+fojwPOgyl4TEZ+qibzOA3mG+186id2lFSagkvJMKko6UXVM/Tofzx0xmImPYXLOCh5C1tIIv8sk40Jpu5AeKYxAIGrGQGcGbsb1AfN3755DudP6R8WM1wYWs/ye+nNsiK+k2jUnbsJHgeNJAPm0NHDyU8ZB7UaeU3KLR7Dzzm85Oigghk4RgqQVZrde9lo6VsedQIDAQAB";
    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://工程公网访问地址/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://localhost:8090/orders/afterOrdersPay";  //正常支付完成后回调地址，去百度（接入到项目中此处为具体的项目地址）

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

