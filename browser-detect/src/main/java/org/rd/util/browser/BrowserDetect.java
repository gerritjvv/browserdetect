package org.rd.util.browser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class BrowserDetect {


	static final Pattern rwebkit = Pattern.compile("(webkit)[ \\/]([\\w.]+)");
	static final Pattern ropera = Pattern.compile("(opera)(?:.*version)?[ \\/]([\\w.]+)");
	static final Pattern rmsie = Pattern.compile("(msie) ([\\w.]+)");
	static final Pattern rmozilla = Pattern.compile("(mozilla)(?:.*? rv:([\\w.]+))?");
	static final Pattern rchrome = Pattern.compile("(chrome)[ \\/]([\\w.]+)");
	
	static final Pattern rlinux = Pattern.compile("(linux)[ ]([\\w.]+)");
	static final Pattern rwindows = Pattern.compile("(windows|winnt)[ ]([\\w.]+)");
	static final Pattern rmac = Pattern.compile("(mac)[ ]([\\w.]+)");
	static final Pattern ripad = Pattern.compile("(ipad)[ ]([\\w.]+)");
	static final Pattern riphone = Pattern.compile("(iphone)[ ]([\\w.]+)");
	static final Pattern randroid = Pattern.compile("(android)[ ]([\\w.]+)");
	
	boolean chrome, msie, mozilla, opera, webkit;
	boolean linux, windows, mac, ipad, iphone, android; 
	String version;

	String osVersion;
		
	public BrowserDetect(String ua) {
		
		//here we detect the browser and the version using the jquery library as our reference
		final String userAgent = ua.toLowerCase();
		
		Matcher m;
		

		if(webkit = (m = rwebkit.matcher(userAgent)).find())
			version = m.group(2);

		if((opera = (m = ropera.matcher(userAgent)).find()))
			version = m.group(2);

		if((chrome = (m = rchrome.matcher(userAgent)).find()))
			version = m.group(2);

		if((msie = (m = rmsie.matcher(userAgent)).find()))
			version = m.group(2);
		
		if(ua.indexOf("compatible") < 0 &&  (mozilla = (m = rmozilla.matcher(userAgent)).find()))
			if(version == null) 
				version = m.group(2);
		
		
		if((linux = (m = rlinux.matcher(userAgent)).find()))
			osVersion = m.group(2);
	
		if(osVersion == null &&  (windows = (m = rwindows.matcher(userAgent)).find()))
			osVersion = m.group(2);
		
		if(osVersion == null &&  (mac = (m = rmac.matcher(userAgent)).find()))
			osVersion = m.group(2);
		
		if(osVersion == null &&  (ipad = (m = ripad.matcher(userAgent)).find()))
			osVersion = m.group(2);
		
		if(osVersion == null &&  (android = (m = randroid.matcher(userAgent)).find()))
			osVersion = m.group(2);
		
	}
	
	public String getVersion(){
		return version;
	}

	public String getOsVersion(){
		return osVersion;
	}
	
	public boolean isChrome() {
		return chrome;
	}

	public boolean isMsie() {
		return msie;
	}

	public boolean isMozilla() {
		return mozilla;
	}

	public boolean isOpera() {
		return opera;
	}

	public boolean isWebkit() {
		return webkit;
	}
	

	public boolean isLinux() {
		return linux;
	}

	public boolean isWindows() {
		return windows;
	}

	public boolean isMac() {
		return mac;
	}

	public boolean isIpad() {
		return ipad;
	}

	public boolean isIphone() {
		return iphone;
	}
	
	public boolean isAndroid(){
		return android;
	}

}
