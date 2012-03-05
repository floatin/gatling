/**
 * Copyright 2011-2012 eBusiness Information, Groupe Excilys (www.excilys.com)
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
 */
package com.excilys.ebi.gatling.core
import com.excilys.ebi.gatling.core.session.Session
import com.excilys.ebi.gatling.core.session.EvaluatableString
package object check {

	type Extractor[X] = String => Option[X]
	type ExtractorFactory[R, X] = R => Extractor[X]
	type VerificationStrategy[X] = (Option[X], Session) => CheckResult
	type Verification[R] = (EvaluatableString, Session, R) => CheckResult
	type CheckBuilderFactory[C <: Check[R], R] = (Verification[R], Option[String]) => C
}