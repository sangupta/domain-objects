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

package com.sangupta.jerry;

import org.junit.Assert;
import org.junit.Test;

import com.sangupta.domain.email.EmailAddress;

/**
 * Unit tests for {@link EmailAddress} class
 * 
 * @author sangupta
 *
 */
public class TestEmailAddress {

	@Test
	public void testEquals() {
		String email = "me@sangupta.com";
		
		EmailAddress ea1 = new EmailAddress();
		ea1.setEmail(email);
		
		EmailAddress ea2 = new EmailAddress(email);
		
		EmailAddress ea3 = new EmailAddress("Sandeep Gupta", email);
		
		EmailAddress ea4 = new EmailAddress("Sandeep", email);
		
		Assert.assertEquals(ea1, ea2);
		Assert.assertEquals(ea1, ea3);
		Assert.assertEquals(ea1, ea4);
		
		ea4.setEmail("hello@sangupta.com");
		Assert.assertNotEquals(ea1, ea4);
	}
}
