/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.shengsiyuan.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-10-18")
public class Person implements org.apache.thrift.TBase<Person, Person._Fields>, java.io.Serializable, Cloneable, Comparable<Person> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Person");

  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField AGE_FIELD_DESC = new org.apache.thrift.protocol.TField("age", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField MARRIED_FIELD_DESC = new org.apache.thrift.protocol.TField("married", org.apache.thrift.protocol.TType.BOOL, (short)3);
  private static final org.apache.thrift.protocol.TField CHILDREN_FIELD_DESC = new org.apache.thrift.protocol.TField("children", org.apache.thrift.protocol.TType.LIST, (short)4);
  private static final org.apache.thrift.protocol.TField MAPPER_FIELD_DESC = new org.apache.thrift.protocol.TField("mapper", org.apache.thrift.protocol.TType.MAP, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new PersonStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new PersonTupleSchemeFactory();

  public java.lang.String name; // optional
  public int age; // optional
  public boolean married; // optional
  public java.util.List<java.lang.String> children; // optional
  public java.util.Map<java.lang.Integer,java.lang.String> mapper; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NAME((short)1, "name"),
    AGE((short)2, "age"),
    MARRIED((short)3, "married"),
    CHILDREN((short)4, "children"),
    MAPPER((short)5, "mapper");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // NAME
          return NAME;
        case 2: // AGE
          return AGE;
        case 3: // MARRIED
          return MARRIED;
        case 4: // CHILDREN
          return CHILDREN;
        case 5: // MAPPER
          return MAPPER;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __AGE_ISSET_ID = 0;
  private static final int __MARRIED_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.NAME,_Fields.AGE,_Fields.MARRIED,_Fields.CHILDREN,_Fields.MAPPER};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "String")));
    tmpMap.put(_Fields.AGE, new org.apache.thrift.meta_data.FieldMetaData("age", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "int")));
    tmpMap.put(_Fields.MARRIED, new org.apache.thrift.meta_data.FieldMetaData("married", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL        , "boolean")));
    tmpMap.put(_Fields.CHILDREN, new org.apache.thrift.meta_data.FieldMetaData("children", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING            , "String"))));
    tmpMap.put(_Fields.MAPPER, new org.apache.thrift.meta_data.FieldMetaData("mapper", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32            , "int"), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING            , "String"))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Person.class, metaDataMap);
  }

  public Person() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Person(Person other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetName()) {
      this.name = other.name;
    }
    this.age = other.age;
    this.married = other.married;
    if (other.isSetChildren()) {
      java.util.List<java.lang.String> __this__children = new java.util.ArrayList<java.lang.String>(other.children.size());
      for (java.lang.String other_element : other.children) {
        __this__children.add(other_element);
      }
      this.children = __this__children;
    }
    if (other.isSetMapper()) {
      java.util.Map<java.lang.Integer,java.lang.String> __this__mapper = new java.util.HashMap<java.lang.Integer,java.lang.String>(other.mapper.size());
      for (java.util.Map.Entry<java.lang.Integer, java.lang.String> other_element : other.mapper.entrySet()) {

        java.lang.Integer other_element_key = other_element.getKey();
        java.lang.String other_element_value = other_element.getValue();

        java.lang.Integer __this__mapper_copy_key = other_element_key;

        java.lang.String __this__mapper_copy_value = other_element_value;

        __this__mapper.put(__this__mapper_copy_key, __this__mapper_copy_value);
      }
      this.mapper = __this__mapper;
    }
  }

  public Person deepCopy() {
    return new Person(this);
  }

  @Override
  public void clear() {
    this.name = null;
    setAgeIsSet(false);
    this.age = 0;
    setMarriedIsSet(false);
    this.married = false;
    this.children = null;
    this.mapper = null;
  }

  public java.lang.String getName() {
    return this.name;
  }

  public Person setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public int getAge() {
    return this.age;
  }

  public Person setAge(int age) {
    this.age = age;
    setAgeIsSet(true);
    return this;
  }

  public void unsetAge() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __AGE_ISSET_ID);
  }

  /** Returns true if field age is set (has been assigned a value) and false otherwise */
  public boolean isSetAge() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __AGE_ISSET_ID);
  }

  public void setAgeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __AGE_ISSET_ID, value);
  }

  public boolean isMarried() {
    return this.married;
  }

  public Person setMarried(boolean married) {
    this.married = married;
    setMarriedIsSet(true);
    return this;
  }

  public void unsetMarried() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __MARRIED_ISSET_ID);
  }

  /** Returns true if field married is set (has been assigned a value) and false otherwise */
  public boolean isSetMarried() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __MARRIED_ISSET_ID);
  }

  public void setMarriedIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __MARRIED_ISSET_ID, value);
  }

  public int getChildrenSize() {
    return (this.children == null) ? 0 : this.children.size();
  }

  public java.util.Iterator<java.lang.String> getChildrenIterator() {
    return (this.children == null) ? null : this.children.iterator();
  }

  public void addToChildren(java.lang.String elem) {
    if (this.children == null) {
      this.children = new java.util.ArrayList<java.lang.String>();
    }
    this.children.add(elem);
  }

  public java.util.List<java.lang.String> getChildren() {
    return this.children;
  }

  public Person setChildren(java.util.List<java.lang.String> children) {
    this.children = children;
    return this;
  }

  public void unsetChildren() {
    this.children = null;
  }

  /** Returns true if field children is set (has been assigned a value) and false otherwise */
  public boolean isSetChildren() {
    return this.children != null;
  }

  public void setChildrenIsSet(boolean value) {
    if (!value) {
      this.children = null;
    }
  }

  public int getMapperSize() {
    return (this.mapper == null) ? 0 : this.mapper.size();
  }

  public void putToMapper(int key, java.lang.String val) {
    if (this.mapper == null) {
      this.mapper = new java.util.HashMap<java.lang.Integer,java.lang.String>();
    }
    this.mapper.put(key, val);
  }

  public java.util.Map<java.lang.Integer,java.lang.String> getMapper() {
    return this.mapper;
  }

  public Person setMapper(java.util.Map<java.lang.Integer,java.lang.String> mapper) {
    this.mapper = mapper;
    return this;
  }

  public void unsetMapper() {
    this.mapper = null;
  }

  /** Returns true if field mapper is set (has been assigned a value) and false otherwise */
  public boolean isSetMapper() {
    return this.mapper != null;
  }

  public void setMapperIsSet(boolean value) {
    if (!value) {
      this.mapper = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((java.lang.String)value);
      }
      break;

    case AGE:
      if (value == null) {
        unsetAge();
      } else {
        setAge((java.lang.Integer)value);
      }
      break;

    case MARRIED:
      if (value == null) {
        unsetMarried();
      } else {
        setMarried((java.lang.Boolean)value);
      }
      break;

    case CHILDREN:
      if (value == null) {
        unsetChildren();
      } else {
        setChildren((java.util.List<java.lang.String>)value);
      }
      break;

    case MAPPER:
      if (value == null) {
        unsetMapper();
      } else {
        setMapper((java.util.Map<java.lang.Integer,java.lang.String>)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case NAME:
      return getName();

    case AGE:
      return getAge();

    case MARRIED:
      return isMarried();

    case CHILDREN:
      return getChildren();

    case MAPPER:
      return getMapper();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case NAME:
      return isSetName();
    case AGE:
      return isSetAge();
    case MARRIED:
      return isSetMarried();
    case CHILDREN:
      return isSetChildren();
    case MAPPER:
      return isSetMapper();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof Person)
      return this.equals((Person)that);
    return false;
  }

  public boolean equals(Person that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_age = true && this.isSetAge();
    boolean that_present_age = true && that.isSetAge();
    if (this_present_age || that_present_age) {
      if (!(this_present_age && that_present_age))
        return false;
      if (this.age != that.age)
        return false;
    }

    boolean this_present_married = true && this.isSetMarried();
    boolean that_present_married = true && that.isSetMarried();
    if (this_present_married || that_present_married) {
      if (!(this_present_married && that_present_married))
        return false;
      if (this.married != that.married)
        return false;
    }

    boolean this_present_children = true && this.isSetChildren();
    boolean that_present_children = true && that.isSetChildren();
    if (this_present_children || that_present_children) {
      if (!(this_present_children && that_present_children))
        return false;
      if (!this.children.equals(that.children))
        return false;
    }

    boolean this_present_mapper = true && this.isSetMapper();
    boolean that_present_mapper = true && that.isSetMapper();
    if (this_present_mapper || that_present_mapper) {
      if (!(this_present_mapper && that_present_mapper))
        return false;
      if (!this.mapper.equals(that.mapper))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetName()) ? 131071 : 524287);
    if (isSetName())
      hashCode = hashCode * 8191 + name.hashCode();

    hashCode = hashCode * 8191 + ((isSetAge()) ? 131071 : 524287);
    if (isSetAge())
      hashCode = hashCode * 8191 + age;

    hashCode = hashCode * 8191 + ((isSetMarried()) ? 131071 : 524287);
    if (isSetMarried())
      hashCode = hashCode * 8191 + ((married) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetChildren()) ? 131071 : 524287);
    if (isSetChildren())
      hashCode = hashCode * 8191 + children.hashCode();

    hashCode = hashCode * 8191 + ((isSetMapper()) ? 131071 : 524287);
    if (isSetMapper())
      hashCode = hashCode * 8191 + mapper.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(Person other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetName()).compareTo(other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetAge()).compareTo(other.isSetAge());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAge()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.age, other.age);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetMarried()).compareTo(other.isSetMarried());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMarried()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.married, other.married);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetChildren()).compareTo(other.isSetChildren());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetChildren()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.children, other.children);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetMapper()).compareTo(other.isSetMapper());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMapper()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.mapper, other.mapper);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("Person(");
    boolean first = true;

    if (isSetName()) {
      sb.append("name:");
      if (this.name == null) {
        sb.append("null");
      } else {
        sb.append(this.name);
      }
      first = false;
    }
    if (isSetAge()) {
      if (!first) sb.append(", ");
      sb.append("age:");
      sb.append(this.age);
      first = false;
    }
    if (isSetMarried()) {
      if (!first) sb.append(", ");
      sb.append("married:");
      sb.append(this.married);
      first = false;
    }
    if (isSetChildren()) {
      if (!first) sb.append(", ");
      sb.append("children:");
      if (this.children == null) {
        sb.append("null");
      } else {
        sb.append(this.children);
      }
      first = false;
    }
    if (isSetMapper()) {
      if (!first) sb.append(", ");
      sb.append("mapper:");
      if (this.mapper == null) {
        sb.append("null");
      } else {
        sb.append(this.mapper);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class PersonStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public PersonStandardScheme getScheme() {
      return new PersonStandardScheme();
    }
  }

  private static class PersonStandardScheme extends org.apache.thrift.scheme.StandardScheme<Person> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Person struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // AGE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.age = iprot.readI32();
              struct.setAgeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // MARRIED
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.married = iprot.readBool();
              struct.setMarriedIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // CHILDREN
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.children = new java.util.ArrayList<java.lang.String>(_list0.size);
                java.lang.String _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = iprot.readString();
                  struct.children.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setChildrenIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // MAPPER
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map3 = iprot.readMapBegin();
                struct.mapper = new java.util.HashMap<java.lang.Integer,java.lang.String>(2*_map3.size);
                int _key4;
                java.lang.String _val5;
                for (int _i6 = 0; _i6 < _map3.size; ++_i6)
                {
                  _key4 = iprot.readI32();
                  _val5 = iprot.readString();
                  struct.mapper.put(_key4, _val5);
                }
                iprot.readMapEnd();
              }
              struct.setMapperIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Person struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.name != null) {
        if (struct.isSetName()) {
          oprot.writeFieldBegin(NAME_FIELD_DESC);
          oprot.writeString(struct.name);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetAge()) {
        oprot.writeFieldBegin(AGE_FIELD_DESC);
        oprot.writeI32(struct.age);
        oprot.writeFieldEnd();
      }
      if (struct.isSetMarried()) {
        oprot.writeFieldBegin(MARRIED_FIELD_DESC);
        oprot.writeBool(struct.married);
        oprot.writeFieldEnd();
      }
      if (struct.children != null) {
        if (struct.isSetChildren()) {
          oprot.writeFieldBegin(CHILDREN_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.children.size()));
            for (java.lang.String _iter7 : struct.children)
            {
              oprot.writeString(_iter7);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.mapper != null) {
        if (struct.isSetMapper()) {
          oprot.writeFieldBegin(MAPPER_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.STRING, struct.mapper.size()));
            for (java.util.Map.Entry<java.lang.Integer, java.lang.String> _iter8 : struct.mapper.entrySet())
            {
              oprot.writeI32(_iter8.getKey());
              oprot.writeString(_iter8.getValue());
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PersonTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public PersonTupleScheme getScheme() {
      return new PersonTupleScheme();
    }
  }

  private static class PersonTupleScheme extends org.apache.thrift.scheme.TupleScheme<Person> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Person struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetName()) {
        optionals.set(0);
      }
      if (struct.isSetAge()) {
        optionals.set(1);
      }
      if (struct.isSetMarried()) {
        optionals.set(2);
      }
      if (struct.isSetChildren()) {
        optionals.set(3);
      }
      if (struct.isSetMapper()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetName()) {
        oprot.writeString(struct.name);
      }
      if (struct.isSetAge()) {
        oprot.writeI32(struct.age);
      }
      if (struct.isSetMarried()) {
        oprot.writeBool(struct.married);
      }
      if (struct.isSetChildren()) {
        {
          oprot.writeI32(struct.children.size());
          for (java.lang.String _iter9 : struct.children)
          {
            oprot.writeString(_iter9);
          }
        }
      }
      if (struct.isSetMapper()) {
        {
          oprot.writeI32(struct.mapper.size());
          for (java.util.Map.Entry<java.lang.Integer, java.lang.String> _iter10 : struct.mapper.entrySet())
          {
            oprot.writeI32(_iter10.getKey());
            oprot.writeString(_iter10.getValue());
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Person struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.name = iprot.readString();
        struct.setNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.age = iprot.readI32();
        struct.setAgeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.married = iprot.readBool();
        struct.setMarriedIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TList _list11 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.children = new java.util.ArrayList<java.lang.String>(_list11.size);
          java.lang.String _elem12;
          for (int _i13 = 0; _i13 < _list11.size; ++_i13)
          {
            _elem12 = iprot.readString();
            struct.children.add(_elem12);
          }
        }
        struct.setChildrenIsSet(true);
      }
      if (incoming.get(4)) {
        {
          org.apache.thrift.protocol.TMap _map14 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.mapper = new java.util.HashMap<java.lang.Integer,java.lang.String>(2*_map14.size);
          int _key15;
          java.lang.String _val16;
          for (int _i17 = 0; _i17 < _map14.size; ++_i17)
          {
            _key15 = iprot.readI32();
            _val16 = iprot.readString();
            struct.mapper.put(_key15, _val16);
          }
        }
        struct.setMapperIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
