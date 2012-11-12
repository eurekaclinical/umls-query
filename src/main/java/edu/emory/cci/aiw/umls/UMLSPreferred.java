/*
 * #%L
 * UMLSQuery
 * %%
 * Copyright (C) 2012 Emory University
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package edu.emory.cci.aiw.umls;

/**
 * An enum describing all of the options for the "preferred" parameter in a UMLS
 * getSTR query.
 * 
 * @author Michel Mansour
 * 
 */
public enum UMLSPreferred {
    /**
     * Signifies neither preferred nor not preferred. Equivalent to leaving the
     * preference parameter out of the query.
     */
    NO_PREFERENCE, 
    
    /**
     * Equivalent to setting the preference parameter to 'no'.
     */
    NOT_PREFERRED, 
    
    /**
     * Equivalent to setting the preference parameter to 'yes'
     */
    PREFERRED;
}
