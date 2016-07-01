//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.09 at 01:57:30 PM GMT 
//


package uk.ac.ebi.intact.bridges.picr.jaxb;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the uk.ac.ebi.intact.bridges.picr.jaxb package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CRC64_QNAME = new QName("http://model.picr.ebi.ac.uk", "CRC64");
    private final static QName _UPI_QNAME = new QName("http://model.picr.ebi.ac.uk", "UPI");
    private final static QName _Accession_QNAME = new QName("http://model.picr.ebi.ac.uk", "accession");
    private final static QName _AccessionVersion_QNAME = new QName("http://model.picr.ebi.ac.uk", "accessionVersion");
    private final static QName _DatabaseDescription_QNAME = new QName("http://model.picr.ebi.ac.uk", "databaseDescription");
    private final static QName _DatabaseName_QNAME = new QName("http://model.picr.ebi.ac.uk", "databaseName");
    private final static QName _DateAdded_QNAME = new QName("http://model.picr.ebi.ac.uk", "dateAdded");
    private final static QName _DateDeleted_QNAME = new QName("http://model.picr.ebi.ac.uk", "dateDeleted");
    private final static QName _Deleted_QNAME = new QName("http://model.picr.ebi.ac.uk", "deleted");
    private final static QName _Gi_QNAME = new QName("http://model.picr.ebi.ac.uk", "gi");
    private final static QName _TaxonId_QNAME = new QName("http://model.picr.ebi.ac.uk", "taxonId");
    private final static QName _Sequence_QNAME = new QName("http://model.picr.ebi.ac.uk", "sequence");
    private final static QName _Timestamp_QNAME = new QName("http://model.picr.ebi.ac.uk", "timestamp");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: uk.ac.ebi.intact.bridges.picr.jaxb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IdenticalCrossReferences }
     * 
     */
    public IdenticalCrossReferences createIdenticalCrossReferences() {
        return new IdenticalCrossReferences();
    }

    /**
     * Create an instance of {@link GetUPIForAccessionResponse }
     * 
     */
    public GetUPIForAccessionResponse createGetUPIForAccessionResponse() {
        return new GetUPIForAccessionResponse();
    }

    /**
     * Create an instance of {@link GetUPIForAccessionReturn }
     * 
     */
    public GetUPIForAccessionReturn createGetUPIForAccessionReturn() {
        return new GetUPIForAccessionReturn();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.picr.ebi.ac.uk", name = "CRC64")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCRC64(String value) {
        return new JAXBElement<String>(_CRC64_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.picr.ebi.ac.uk", name = "UPI")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createUPI(String value) {
        return new JAXBElement<String>(_UPI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.picr.ebi.ac.uk", name = "accession")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAccession(String value) {
        return new JAXBElement<String>(_Accession_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.picr.ebi.ac.uk", name = "accessionVersion")
    public JAXBElement<BigInteger> createAccessionVersion(BigInteger value) {
        return new JAXBElement<BigInteger>(_AccessionVersion_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.picr.ebi.ac.uk", name = "databaseDescription")
    public JAXBElement<String> createDatabaseDescription(String value) {
        return new JAXBElement<String>(_DatabaseDescription_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.picr.ebi.ac.uk", name = "databaseName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDatabaseName(String value) {
        return new JAXBElement<String>(_DatabaseName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.picr.ebi.ac.uk", name = "dateAdded")
    public JAXBElement<XMLGregorianCalendar> createDateAdded(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateAdded_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.picr.ebi.ac.uk", name = "dateDeleted")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDateDeleted(String value) {
        return new JAXBElement<String>(_DateDeleted_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.picr.ebi.ac.uk", name = "deleted")
    public JAXBElement<Boolean> createDeleted(Boolean value) {
        return new JAXBElement<Boolean>(_Deleted_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.picr.ebi.ac.uk", name = "gi")
    public JAXBElement<BigInteger> createGi(BigInteger value) {
        return new JAXBElement<BigInteger>(_Gi_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.picr.ebi.ac.uk", name = "taxonId")
    public JAXBElement<BigInteger> createTaxonId(BigInteger value) {
        return new JAXBElement<BigInteger>(_TaxonId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.picr.ebi.ac.uk", name = "sequence")
    public JAXBElement<String> createSequence(String value) {
        return new JAXBElement<String>(_Sequence_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.picr.ebi.ac.uk", name = "timestamp")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTimestamp(String value) {
        return new JAXBElement<String>(_Timestamp_QNAME, String.class, null, value);
    }

}
