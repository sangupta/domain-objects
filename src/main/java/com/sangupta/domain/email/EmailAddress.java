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

package com.sangupta.domain.email;

import java.util.HashSet;
import java.util.Set;

/**
 * Value object to store one email address. Two {@link EmailAddress} objects
 * are considered to be equal if the email address provided in them is equal.
 * Currently, equality of email address is determined using string comparison,
 * but this needs to be improved to make sure of case in-sensitivity and encoded
 * email addresses.
 * 
 * @author sangupta
 *
 */
public class EmailAddress {

	/**
	 * The name of the user
	 */
	private String name;
	
	/**
	 * The email address of the user
	 * 
	 */
	private String email;
	
	/**
	 * Default constructor
	 */
	public EmailAddress() {
		
	}
	
	/**
	 * Convenience constructor
	 * 
	 * @param address
	 *            the email address to set
	 */
	public EmailAddress(String address) {
		this.email = address;
	}
	
	/**
	 * Convenience constructor
	 * 
	 * @param name
	 *            the name of the user to set
	 * 
	 * @param address
	 *            the email address to set
	 */
	public EmailAddress(String name, String address) {
		this.name = name;
		this.email = address;
	}
	
	/**
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof EmailAddress)) {
			return false;
		}
		
		EmailAddress ea = (EmailAddress) obj;
		return this.email.equals(ea.email);
	}
	
	/**
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		if(this.email != null) {
			return this.email.hashCode();
		}
		
		return -1;
	}
	
	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		if(this.name != null) {
			return "<" + this.name + "> " + this.email;
		}
		
		return this.email;
	}
	
	// Usual accessors follow

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Parse a string that contains multiple email addresses and return a {@link Set}
	 * of {@link EmailAddress} objects that can then be set to various properties
	 * of {@link Email} object.
	 * 
	 * @param email
	 * @return
	 */
	public static Set<EmailAddress> parseMultiple(String email) {
		if(email == null || email.isEmpty()) {
			throw new IllegalArgumentException("Email cannot be empty/null");
		}
		
		Set<EmailAddress> emails = new HashSet<EmailAddress>();
		String[] tokens = email.split("[;,]");
		for(String token : tokens) {
			token = token.trim();
			
			// check for angular brackets
			if(token.contains("<") || token.contains(">")) {
				int start = token.indexOf('<');
				int end = token.indexOf('>');
				if(start >= 0 && end > start) {
					String name = token.substring(start + 1, end).trim();
					String em = token.substring(end + 1).trim();
					emails.add(new EmailAddress(name, em));
				} else {
					emails.add(new EmailAddress(token));
				}
			} else {
				emails.add(new EmailAddress(token));
			}
		}
		
		return emails;
	}

}
