package org.omg.IOP;

/**
* org/omg/IOP/IORHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/jenkins/workspace/8-2-build-windows-x64-cygwin-sans-NAS/jdk8u411/893/corba/src/share/classes/org/omg/PortableInterceptor/IOP.idl
* Wednesday, March 13, 2024 7:26:58 AM UTC
*/

public final class IORHolder implements org.omg.CORBA.portable.Streamable
{
  public org.omg.IOP.IOR value = null;

  public IORHolder ()
  {
  }

  public IORHolder (org.omg.IOP.IOR initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.omg.IOP.IORHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.omg.IOP.IORHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.omg.IOP.IORHelper.type ();
  }

}
