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
package com.excilys.ebi.gatling.statistics.generator

import com.excilys.ebi.gatling.statistics.presenter.DataPresenter
import com.excilys.ebi.gatling.statistics.extractor.DataExtractor

class SimpleGraphicGenerator[R](dataExtractor: DataExtractor[R], dataPresenter: DataPresenter[R]) extends GraphicGenerator {

	def onRow(runOn: String, scenarioName: String, userId: String, actionName: String, executionStartDate: String, executionDuration: String, resultStatus: String, resultMessage: String, groups: List[String]) {
		dataExtractor.onRow(runOn, scenarioName, userId, actionName, executionStartDate, executionDuration, resultStatus, resultMessage, groups)
	}

	def generateGraphFor(runOn: String) {
		dataPresenter.generateGraphFor(runOn, dataExtractor.getResults())
	}
}