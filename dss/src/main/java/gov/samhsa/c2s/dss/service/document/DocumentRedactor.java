/*******************************************************************************
 * Open Behavioral Health Information Technology Architecture (OBHITA.org)
 * <p>
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 * * Redistributions of source code must retain the above copyright
 * notice, this list of conditions and the following disclaimer.
 * * Redistributions in binary form must reproduce the above copyright
 * notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 * * Neither the name of the <organization> nor the
 * names of its contributors may be used to endorse or promote products
 * derived from this software without specific prior written permission.
 * <p>
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL <COPYRIGHT HOLDER> BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 ******************************************************************************/
package gov.samhsa.c2s.dss.service.document;

import gov.samhsa.c2s.brms.domain.FactModel;
import gov.samhsa.c2s.brms.domain.RuleExecutionContainer;
import gov.samhsa.c2s.dss.service.Redactor;
import gov.samhsa.c2s.dss.service.document.dto.RedactedDocument;

/**
 * The Interface DocumentRedactor.
 */
public interface DocumentRedactor extends Redactor {

    /**
     * Redact document.
     *
     * @param document               the document
     * @param ruleExecutionContainer the rule execution container
     * @param factModel              the fact model
     * @return the string
     */
    RedactedDocument redactDocument(String document,
                                    RuleExecutionContainer ruleExecutionContainer, FactModel factModel);

    /**
     * Clean up generated entry ids.
     *
     * @param document the document
     * @return the string
     */
    String cleanUpGeneratedEntryIds(String document);

    /**
     * Clean up generated service event ids.
     *
     * @param document the document
     * @return the string
     */
    String cleanUpGeneratedServiceEventIds(String document);

    /**
     * Clean up embedded clinical document from fact model.
     *
     * @param factModelXml the fact model xml
     * @return the string
     */
    String cleanUpEmbeddedClinicalDocumentFromFactModel(
            String factModelXml);
}
