/**
 *
 * domain-objects - Contract and implementations for common-useful domain objects
 * Copyright (c) 2016, Sandeep Gupta
 * 
 * http://sangupta.com/projects/domain-objects
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * 		http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

package com.sangupta.domain.image;

/**
 * An image that is available on the web - is represented by a URL and has a
 * width and height.
 * 
 * @author sangupta
 *
 */
public class WebImage {

	private String url;

	private int width;

	private int height;

	/**
	 * Default contructor
	 * 
	 */
	public WebImage() {

	}

	/**
	 * Convenience constructor
	 * 
	 * @param url
	 */
	public WebImage(String url) {
		this.url = url;
	}

	@Override
	public int hashCode() {
		if (this.url == null) {
			return 0;
		}

		return this.url.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		if (this == obj) {
			return true;
		}

		if (!(obj instanceof WebImage)) {
			return false;
		}

		WebImage other = (WebImage) obj;
		return this.url.equals(other.url);
	}
	
	// Usual accessors follow

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}
}
