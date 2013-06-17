/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2013-06-05 16:09:48 UTC)
 * on 2013-06-17 at 08:15:10 UTC 
 * Modify at your own risk.
 */

package com.crashdev.buyauser.ofertaendpoint;

/**
 * Service definition for Ofertaendpoint (v1).
 *
 * <p>
 * This is an API
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link OfertaendpointRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Ofertaendpoint extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.15.0-rc of the  library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://buyabeta.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "ofertaendpoint/v1/";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public Ofertaendpoint(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Ofertaendpoint(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * Create a request for the method "getOferta".
   *
   * This request holds the parameters needed by the the ofertaendpoint server.  After setting any
   * optional parameters, call the {@link GetOferta#execute()} method to invoke the remote operation.
   *
   * @param id
   * @return the request
   */
  public GetOferta getOferta(java.lang.String id) throws java.io.IOException {
    GetOferta result = new GetOferta(id);
    initialize(result);
    return result;
  }

  public class GetOferta extends OfertaendpointRequest<com.crashdev.buyauser.ofertaendpoint.model.Oferta> {

    private static final String REST_PATH = "oferta/{id}";

    /**
     * Create a request for the method "getOferta".
     *
     * This request holds the parameters needed by the the ofertaendpoint server.  After setting any
     * optional parameters, call the {@link GetOferta#execute()} method to invoke the remote
     * operation. <p> {@link
     * GetOferta#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected GetOferta(java.lang.String id) {
      super(Ofertaendpoint.this, "GET", REST_PATH, null, com.crashdev.buyauser.ofertaendpoint.model.Oferta.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public GetOferta setAlt(java.lang.String alt) {
      return (GetOferta) super.setAlt(alt);
    }

    @Override
    public GetOferta setFields(java.lang.String fields) {
      return (GetOferta) super.setFields(fields);
    }

    @Override
    public GetOferta setKey(java.lang.String key) {
      return (GetOferta) super.setKey(key);
    }

    @Override
    public GetOferta setOauthToken(java.lang.String oauthToken) {
      return (GetOferta) super.setOauthToken(oauthToken);
    }

    @Override
    public GetOferta setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetOferta) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetOferta setQuotaUser(java.lang.String quotaUser) {
      return (GetOferta) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetOferta setUserIp(java.lang.String userIp) {
      return (GetOferta) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String id;

    /**

     */
    public java.lang.String getId() {
      return id;
    }

    public GetOferta setId(java.lang.String id) {
      this.id = id;
      return this;
    }

    @Override
    public GetOferta set(String parameterName, Object value) {
      return (GetOferta) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "insertOferta".
   *
   * This request holds the parameters needed by the the ofertaendpoint server.  After setting any
   * optional parameters, call the {@link InsertOferta#execute()} method to invoke the remote
   * operation.
   *
   * @param content the {@link com.crashdev.buyauser.ofertaendpoint.model.Oferta}
   * @return the request
   */
  public InsertOferta insertOferta(com.crashdev.buyauser.ofertaendpoint.model.Oferta content) throws java.io.IOException {
    InsertOferta result = new InsertOferta(content);
    initialize(result);
    return result;
  }

  public class InsertOferta extends OfertaendpointRequest<com.crashdev.buyauser.ofertaendpoint.model.Oferta> {

    private static final String REST_PATH = "oferta";

    /**
     * Create a request for the method "insertOferta".
     *
     * This request holds the parameters needed by the the ofertaendpoint server.  After setting any
     * optional parameters, call the {@link InsertOferta#execute()} method to invoke the remote
     * operation. <p> {@link
     * InsertOferta#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param content the {@link com.crashdev.buyauser.ofertaendpoint.model.Oferta}
     * @since 1.13
     */
    protected InsertOferta(com.crashdev.buyauser.ofertaendpoint.model.Oferta content) {
      super(Ofertaendpoint.this, "POST", REST_PATH, content, com.crashdev.buyauser.ofertaendpoint.model.Oferta.class);
    }

    @Override
    public InsertOferta setAlt(java.lang.String alt) {
      return (InsertOferta) super.setAlt(alt);
    }

    @Override
    public InsertOferta setFields(java.lang.String fields) {
      return (InsertOferta) super.setFields(fields);
    }

    @Override
    public InsertOferta setKey(java.lang.String key) {
      return (InsertOferta) super.setKey(key);
    }

    @Override
    public InsertOferta setOauthToken(java.lang.String oauthToken) {
      return (InsertOferta) super.setOauthToken(oauthToken);
    }

    @Override
    public InsertOferta setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (InsertOferta) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public InsertOferta setQuotaUser(java.lang.String quotaUser) {
      return (InsertOferta) super.setQuotaUser(quotaUser);
    }

    @Override
    public InsertOferta setUserIp(java.lang.String userIp) {
      return (InsertOferta) super.setUserIp(userIp);
    }

    @Override
    public InsertOferta set(String parameterName, Object value) {
      return (InsertOferta) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "listOferta".
   *
   * This request holds the parameters needed by the the ofertaendpoint server.  After setting any
   * optional parameters, call the {@link ListOferta#execute()} method to invoke the remote operation.
   *
   * @return the request
   */
  public ListOferta listOferta() throws java.io.IOException {
    ListOferta result = new ListOferta();
    initialize(result);
    return result;
  }

  public class ListOferta extends OfertaendpointRequest<com.crashdev.buyauser.ofertaendpoint.model.CollectionResponseOferta> {

    private static final String REST_PATH = "oferta";

    /**
     * Create a request for the method "listOferta".
     *
     * This request holds the parameters needed by the the ofertaendpoint server.  After setting any
     * optional parameters, call the {@link ListOferta#execute()} method to invoke the remote
     * operation. <p> {@link
     * ListOferta#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @since 1.13
     */
    protected ListOferta() {
      super(Ofertaendpoint.this, "GET", REST_PATH, null, com.crashdev.buyauser.ofertaendpoint.model.CollectionResponseOferta.class);
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public ListOferta setAlt(java.lang.String alt) {
      return (ListOferta) super.setAlt(alt);
    }

    @Override
    public ListOferta setFields(java.lang.String fields) {
      return (ListOferta) super.setFields(fields);
    }

    @Override
    public ListOferta setKey(java.lang.String key) {
      return (ListOferta) super.setKey(key);
    }

    @Override
    public ListOferta setOauthToken(java.lang.String oauthToken) {
      return (ListOferta) super.setOauthToken(oauthToken);
    }

    @Override
    public ListOferta setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (ListOferta) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public ListOferta setQuotaUser(java.lang.String quotaUser) {
      return (ListOferta) super.setQuotaUser(quotaUser);
    }

    @Override
    public ListOferta setUserIp(java.lang.String userIp) {
      return (ListOferta) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String cursor;

    /**

     */
    public java.lang.String getCursor() {
      return cursor;
    }

    public ListOferta setCursor(java.lang.String cursor) {
      this.cursor = cursor;
      return this;
    }

    @com.google.api.client.util.Key
    private java.lang.Integer limit;

    /**

     */
    public java.lang.Integer getLimit() {
      return limit;
    }

    public ListOferta setLimit(java.lang.Integer limit) {
      this.limit = limit;
      return this;
    }

    @Override
    public ListOferta set(String parameterName, Object value) {
      return (ListOferta) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "removeOferta".
   *
   * This request holds the parameters needed by the the ofertaendpoint server.  After setting any
   * optional parameters, call the {@link RemoveOferta#execute()} method to invoke the remote
   * operation.
   *
   * @param id
   * @return the request
   */
  public RemoveOferta removeOferta(java.lang.String id) throws java.io.IOException {
    RemoveOferta result = new RemoveOferta(id);
    initialize(result);
    return result;
  }

  public class RemoveOferta extends OfertaendpointRequest<com.crashdev.buyauser.ofertaendpoint.model.Oferta> {

    private static final String REST_PATH = "oferta/{id}";

    /**
     * Create a request for the method "removeOferta".
     *
     * This request holds the parameters needed by the the ofertaendpoint server.  After setting any
     * optional parameters, call the {@link RemoveOferta#execute()} method to invoke the remote
     * operation. <p> {@link
     * RemoveOferta#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected RemoveOferta(java.lang.String id) {
      super(Ofertaendpoint.this, "DELETE", REST_PATH, null, com.crashdev.buyauser.ofertaendpoint.model.Oferta.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public RemoveOferta setAlt(java.lang.String alt) {
      return (RemoveOferta) super.setAlt(alt);
    }

    @Override
    public RemoveOferta setFields(java.lang.String fields) {
      return (RemoveOferta) super.setFields(fields);
    }

    @Override
    public RemoveOferta setKey(java.lang.String key) {
      return (RemoveOferta) super.setKey(key);
    }

    @Override
    public RemoveOferta setOauthToken(java.lang.String oauthToken) {
      return (RemoveOferta) super.setOauthToken(oauthToken);
    }

    @Override
    public RemoveOferta setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (RemoveOferta) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public RemoveOferta setQuotaUser(java.lang.String quotaUser) {
      return (RemoveOferta) super.setQuotaUser(quotaUser);
    }

    @Override
    public RemoveOferta setUserIp(java.lang.String userIp) {
      return (RemoveOferta) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String id;

    /**

     */
    public java.lang.String getId() {
      return id;
    }

    public RemoveOferta setId(java.lang.String id) {
      this.id = id;
      return this;
    }

    @Override
    public RemoveOferta set(String parameterName, Object value) {
      return (RemoveOferta) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "updateOferta".
   *
   * This request holds the parameters needed by the the ofertaendpoint server.  After setting any
   * optional parameters, call the {@link UpdateOferta#execute()} method to invoke the remote
   * operation.
   *
   * @param content the {@link com.crashdev.buyauser.ofertaendpoint.model.Oferta}
   * @return the request
   */
  public UpdateOferta updateOferta(com.crashdev.buyauser.ofertaendpoint.model.Oferta content) throws java.io.IOException {
    UpdateOferta result = new UpdateOferta(content);
    initialize(result);
    return result;
  }

  public class UpdateOferta extends OfertaendpointRequest<com.crashdev.buyauser.ofertaendpoint.model.Oferta> {

    private static final String REST_PATH = "oferta";

    /**
     * Create a request for the method "updateOferta".
     *
     * This request holds the parameters needed by the the ofertaendpoint server.  After setting any
     * optional parameters, call the {@link UpdateOferta#execute()} method to invoke the remote
     * operation. <p> {@link
     * UpdateOferta#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param content the {@link com.crashdev.buyauser.ofertaendpoint.model.Oferta}
     * @since 1.13
     */
    protected UpdateOferta(com.crashdev.buyauser.ofertaendpoint.model.Oferta content) {
      super(Ofertaendpoint.this, "PUT", REST_PATH, content, com.crashdev.buyauser.ofertaendpoint.model.Oferta.class);
    }

    @Override
    public UpdateOferta setAlt(java.lang.String alt) {
      return (UpdateOferta) super.setAlt(alt);
    }

    @Override
    public UpdateOferta setFields(java.lang.String fields) {
      return (UpdateOferta) super.setFields(fields);
    }

    @Override
    public UpdateOferta setKey(java.lang.String key) {
      return (UpdateOferta) super.setKey(key);
    }

    @Override
    public UpdateOferta setOauthToken(java.lang.String oauthToken) {
      return (UpdateOferta) super.setOauthToken(oauthToken);
    }

    @Override
    public UpdateOferta setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (UpdateOferta) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public UpdateOferta setQuotaUser(java.lang.String quotaUser) {
      return (UpdateOferta) super.setQuotaUser(quotaUser);
    }

    @Override
    public UpdateOferta setUserIp(java.lang.String userIp) {
      return (UpdateOferta) super.setUserIp(userIp);
    }

    @Override
    public UpdateOferta set(String parameterName, Object value) {
      return (UpdateOferta) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link Ofertaendpoint}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
    }

    /** Builds a new instance of {@link Ofertaendpoint}. */
    @Override
    public Ofertaendpoint build() {
      return new Ofertaendpoint(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link OfertaendpointRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setOfertaendpointRequestInitializer(
        OfertaendpointRequestInitializer ofertaendpointRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(ofertaendpointRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}