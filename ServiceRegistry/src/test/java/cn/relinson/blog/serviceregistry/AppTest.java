package cn.relinson.blog.serviceregistry;

import javax.naming.NamingException;

import com.netflix.discovery.endpoint.DnsResolver;

/**
 * Unit test for simple App.
 */
public class AppTest {
	public static void main(String[] args) throws NamingException {
		//System.out.println(DnsResolver.resolveARecord("alipay.com"));
		System.out.println(DnsResolver.getCNamesFromTxtRecord("mail.alipay.com"));
	}
}
