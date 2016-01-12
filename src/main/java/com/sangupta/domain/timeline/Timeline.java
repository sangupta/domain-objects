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

import java.util.Collection;

/**
 * Contract for any {@link Object} that wishes to represent
 * a timeline of events. They could be from a social network like
 * Facebook or Twitter, or could be a simple timeline of events
 * like logging, or incoming emails.
 *  
 * @author sangupta
 *
 */
public interface Timeline {

	/**
	 * A chronologically descending list of {@link TimelineEvent}
	 * 
	 * @return a {@link Collection} of {@link TimelineEvent} objects that
	 *         represent the timeline
	 */
	public Collection<TimelineEvent> getTimelineEvents();

	/**
	 * Get the metadata for fetching the next page of events from the timeline.
	 * Should return a <code>null</code> if there is no next page.
	 * 
	 * @return the metadata for next page
	 */
	public String getNextPage();

	/**
	 * Get the metadata for fetching the previous page of events from the timeline.
	 * Should return a <code>null</code> if there is no previous page.
	 * 
	 * @return the metadata for previous page
	 */
	public String getPreviousPage();
	
	/**
	 * Get the page number for this page of information. The page number should be
	 * 0-based. That is the most recent page should always return a <code>ZERO</code>.
	 * 
	 * @return the page number
	 */
	public int getPageNumber();
	
}
