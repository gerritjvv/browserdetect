package org.rd.util.browser;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.rd.util.browser.BrowserDetect;


/**
 * 
 * Use http://www.useragentstring.com/pages/useragentstring.php
 *
 */
public class TestBrowserDetect {

	@Test
	public void testMac(){
		String ua = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_8_0) AppleWebKit/536.3 (KHTML, like Gecko) Chrome/19.0.1063.0 Safari/536.3";
		BrowserDetect browser = new BrowserDetect(ua);
		
		assertTrue(browser.isMac());
		System.out.println("Version: " + browser.getOsVersion());

	}
	
	@Test
	public void testWindows(){
		String ua = "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/536.6 (KHTML, like Gecko) Chrome/20.0.1092.0 Safari/536.6";
		BrowserDetect browser = new BrowserDetect(ua);
		
		assertTrue(browser.isWindows());
		System.out.println("Version: " + browser.getOsVersion());

	}

	@Test
	public void testLinux(){
		String ua = "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/536.5 (KHTML, like Gecko) Chrome/19.0.1084.9 Safari/536.5";
		BrowserDetect browser = new BrowserDetect(ua);
		
		assertTrue(browser.isLinux());
		System.out.println("Version: " + browser.getOsVersion());

	}

	
	@Test
	public void testAndroid(){
		String ua = "Mozilla/5.0 (Linux; U; Android 4.0.3; de-ch; HTC Sensation Build/IML74K) AppleWebKit/534.30 (KHTML, like Gecko) Version/4.0 Mobile Safari/534.30";
		BrowserDetect browser = new BrowserDetect(ua);
		
		assertTrue(browser.isAndroid());
		System.out.println("Version: " + browser.getOsVersion());

	}

	
	@Test
	public void testWebKit(){
		String ua = "Mozilla/5.0 (Linux; U; Android 4.0.3; de-ch; HTC Sensation Build/IML74K) AppleWebKit/534.30 (KHTML, like Gecko) Version/4.0 Mobile Safari/534.30";
		BrowserDetect browser = new BrowserDetect(ua);
		
		assertTrue(browser.isWebkit());
		System.out.println("Version: " + browser.getVersion());

	}

	@Test
	public void testOPERA(){
		String ua = "Opera/9.80 (Windows NT 6.1; U; es-ES) Presto/2.9.181 Version/12.00";
		BrowserDetect browser = new BrowserDetect(ua);
		
		assertTrue(browser.isOpera());
		System.out.println("Version: " + browser.getVersion());

	}

	
	@Test
	public void testMSIE(){
		String ua = "Mozilla/5.0 (compatible; MSIE 10.6; Windows NT 6.1; Trident/5.0; InfoPath.2; SLCC1; .NET CLR 3.0.4506.2152; .NET CLR 3.5.30729; .NET CLR 2.0.50727) 3gpp-gba UNTRUSTED/1.0s";
		BrowserDetect browser = new BrowserDetect(ua);
		
		assertTrue(browser.isMsie());
		System.out.println("Version: " + browser.getVersion());

	}
	
	@Test
	public void testMozilla(){
		String ua = "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:15.0) Gecko/20120427 Firefox/15.0a1";
		BrowserDetect browser = new BrowserDetect(ua);
		
		assertTrue(browser.isMozilla());
		System.out.println("Version: " + browser.getVersion());

	}
	
	@Test
	public void testDetectChrome(){
		
		String ua = "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/536.6 (KHTML, like Gecko) Chrome/20.0.1092.0 Safari/536.6";
		BrowserDetect browser = new BrowserDetect(ua);
		
		assertTrue(browser.isChrome());
		System.out.println("Version: " + browser.getVersion());
	}
	
}
