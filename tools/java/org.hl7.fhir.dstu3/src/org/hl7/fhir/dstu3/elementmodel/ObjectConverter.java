package org.hl7.fhir.dstu3.elementmodel;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import org.hl7.fhir.dstu3.formats.IParser.OutputStyle;
import org.hl7.fhir.dstu3.model.ImplementationGuide;
import org.hl7.fhir.dstu3.model.Resource;
import org.hl7.fhir.dstu3.utils.IWorkerContext;
import org.hl7.fhir.dstu3.utils.SimpleWorkerContext;

public class ObjectConverter  {

  private IWorkerContext context;

  public ObjectConverter(IWorkerContext context) {
    this.context = context;
  }

  public Element convert(Resource ig) throws Exception {
    ByteArrayOutputStream bs = new ByteArrayOutputStream();
    org.hl7.fhir.dstu3.formats.JsonParser jp = new org.hl7.fhir.dstu3.formats.JsonParser();
    jp.compose(bs, ig);
    ByteArrayInputStream bi = new ByteArrayInputStream(bs.toByteArray());
    return new JsonParser(context).parse(bi);
  }


}