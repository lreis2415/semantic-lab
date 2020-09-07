package org.egc.semantic.util;

import org.apache.jena.rdf.model.*;

/**
 * TODO
 * Utilities to operate ontology
 *
 * @author houzhiwei
 * @date 2017 /4/16 21:16
 */
public class OntologyUtils
{
    /**
     * 创建一个statement
     *
     * @param model    the model
     * @param subject  主语 uri
     * @param property 谓词 uri
     * @param object   宾语 uri
     * @return statement
     */
    public static Statement createStmt(Model model, String subject, String property, String object)
    {
        Resource sub = model.createResource(subject);
        Property prop = model.createProperty(property);
        RDFNode obj = model.createResource(object);
        return model.createStatement(sub, prop, obj);
    }

    /**
     * Create simple selector selector:
     * (Resource)subject - (Property)property - (RDFNode)object
     *
     * @param model    the model
     * @param subject  the subject
     * @param property the property
     * @param object   the object
     * @return the selector
     */
    public static Selector createSimpleSelector(Model model, String subject, String property, String object)
    {
        return (Selector) new SimpleSelector(
                (subject != null) ? model.createResource(subject) : (Resource) null,
                (property != null) ? model.createProperty(property) : (Property) null,
                (object != null) ? model.createResource(object) : (RDFNode) null
        );
    }



}