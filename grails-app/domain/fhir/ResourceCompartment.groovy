package fhir
import net.kaleidos.hibernate.usertype.StringArrayType

class ResourceCompartment implements Serializable {

  String fhir_id
  String fhir_type
  String[] compartments = []

  static mapping = {
    table 'resource_compartment'
    id composite: ['fhir_type', 'fhir_id']
    compartments type:StringArrayType
    version false
  }
}