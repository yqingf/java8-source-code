package org.omg.DynamicAny;


/**
* org/omg/DynamicAny/NameDynAnyPair.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /HUDSON/workspace/8-2-build-linux-amd64/jdk8u181/11358/corba/src/share/classes/org/omg/DynamicAny/DynamicAny.idl
* Saturday, July 7, 2018 12:57:15 AM PDT
*/

public final class NameDynAnyPair implements org.omg.CORBA.portable.IDLEntity
{

  /**
          * The name associated with the DynAny.
          */
  public String id = null;

  /**
          * The DynAny value associated with the name.
          */
  public org.omg.DynamicAny.DynAny value = null;

  public NameDynAnyPair ()
  {
  } // ctor

  public NameDynAnyPair (String _id, org.omg.DynamicAny.DynAny _value)
  {
    id = _id;
    value = _value;
  } // ctor

} // class NameDynAnyPair
