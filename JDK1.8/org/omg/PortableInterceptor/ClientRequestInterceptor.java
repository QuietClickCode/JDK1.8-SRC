package org.omg.PortableInterceptor;


/**
* org/omg/PortableInterceptor/ClientRequestInterceptor.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /HUDSON/workspace/8-2-build-linux-amd64/jdk8u191/11894/corba/src/share/classes/org/omg/PortableInterceptor/Interceptors.idl
* Saturday, October 6, 2018 5:43:21 AM PDT
*/


/**
   * Client-side request interceptor.
   * <p>
   * A request Interceptor is designed to intercept the flow of a 
   * request/reply sequence through the ORB at specific points so that 
   * services can query the request information and manipulate the service 
   * contexts which are propagated between clients and servers. The primary 
   * use of request Interceptors is to enable ORB services to transfer 
   * context information between clients and servers. There are two types 
   * of request Interceptors: client-side and server-side. 
   * <p>
   * To write a client-side Interceptor, implement the 
   * <code>ClientRequestInterceptor</code> interface. 
   *
   * @see ClientRequestInfo
   */
public interface ClientRequestInterceptor extends ClientRequestInterceptorOperations, org.omg.PortableInterceptor.Interceptor, org.omg.CORBA.portable.IDLEntity 
{
} // interface ClientRequestInterceptor
