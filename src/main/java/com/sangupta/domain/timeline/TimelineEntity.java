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

package com.sangupta.domain.timeline;

/**
 * Contract for an entity that wishes to serve as an event
 * or entity in a given timeline.
 * 
 * @author sangupta
 *
 */
public interface TimelineEntity {
	
	/**
	 * The unique ID of this entity
	 * 
	 * @return the unique ID for this entity
	 */
	public String getUniqueID();

	/**
	 * The user ID of the owner who owns this entity.
	 * 
	 * @return the unique user ID
	 */
	public String getUserID();

	/**
	 * The time at which this event was created.
	 * 
	 * @return the epoch millis when this event was created
	 */
	public long getCreated();

}
