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

package com.sangupta.domain;

/**
 * Contract for any entity, domain object or a value object that
 * holds the time it was last updated.
 * 
 * This contract allows us to build interceptors in services, so
 * that entity objects can be updated automatically.
 * 
 * @author sangupta
 *
 */
public interface LastUpdateEntity {

	public long getLastUpdateTime();
	
	public void setLastUpdateTime(long time);
	
}
