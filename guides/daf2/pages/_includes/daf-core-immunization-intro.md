his profile sets minimum expectations for the [Immunization] resource to record, fetch and search immunization history associated with a patient. It identifies which core elements, extensions, vocabularies and value sets **SHALL** be present in the resource when using this profile.


##### Mandatory Data Elements and Terminology


The following data-elements are mandatory (i.e data MUST be present). These are presented below in a simple human-readable explanation.  Profile specific guidance and an [example](#example) are provided as well.  The [**Formal Profile Definition**](#profile) below provides the  formal summary, definitions, and  terminology requirements.  

**Each Immunization must have:**

1.  a status
1.  a date the vaccine was administered
1.  a vaccine code that identifies the kind of vaccine administered
1.  a patient
1.  a flag to indicate whether vaccine was given
1.  a flag to indicate whether the vaccine was reported by patient rather than directly administered.


**Profile specific implementation guidance:**

* **NDC codes as a translational data element**: 
Based upon the 2015 Edition Certification Requirements, the [NDC vaccine codes] SHOULD be supported as translations to the CVX vaccine codes. A [NDC to CVX concept map] is provided and the translation is illustrated in the example below.


  [CVX code set]: http://hl7.org/fhir/us/daf/valueset-daf-cvx.html
  [NDC vaccine codes]: valueset-daf-ndc.html
  [NDC to CVX concept map]: conceptmap-ndc-cvx.html
[Immunization]:  http://hl7-fhir.github.io/immunization.html
