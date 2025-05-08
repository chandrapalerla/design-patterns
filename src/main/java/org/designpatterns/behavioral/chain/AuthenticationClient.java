package org.designpatterns.behavioral.chain;

import org.designpatterns.behavioral.chain.manager.AuthenticationHandler;
import org.designpatterns.behavioral.chain.manager.BasicAuthenticationHandler;
import org.designpatterns.behavioral.chain.manager.ClientCertificateAuthenticationHandler;
import org.designpatterns.behavioral.chain.manager.DigestAuthenticationHandler;

public class AuthenticationClient {

  public static void main(String[] args) {

    AuthenticationHandler chain = new BasicAuthenticationHandler(new DigestAuthenticationHandler(new ClientCertificateAuthenticationHandler(null)));
    chain.handleRequest("basic");
    chain.handleRequest("digest");
    chain.handleRequest("client certificate");
  }

}
