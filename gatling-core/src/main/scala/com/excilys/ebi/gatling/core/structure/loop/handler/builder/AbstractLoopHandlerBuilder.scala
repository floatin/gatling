/**
 * Copyright 2011 eBusiness Information, Groupe Excilys (www.excilys.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.excilys.ebi.gatling.core.structure.loop.handler.builder
import com.excilys.ebi.gatling.core.action.builder.AbstractActionBuilder
import com.excilys.ebi.gatling.core.log.Logging
import com.excilys.ebi.gatling.core.structure.builder.AbstractStructureBuilder

abstract class AbstractLoopHandlerBuilder[B <: AbstractStructureBuilder[B]](structureBuilder: B) extends Logging {
	def build: B

	protected def doBuild(actionBuilders: List[AbstractActionBuilder]) = structureBuilder.addActionBuilders(actionBuilders)
}