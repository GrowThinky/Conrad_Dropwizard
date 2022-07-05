package conrad.codeworkshop.core;


import io.dropwizard.Configuration;

import javax.validation.constraints.NotNull;

public final class Config extends Configuration {

  @NotNull
  private boolean shouldDoSearch;

  @NotNull
  private String elasticsearchHost;

  @NotNull
  private int port;

  private String[] supportedSort;

  public boolean isShouldDoSearch() {
    return shouldDoSearch;
  }

  public String getElasticsearchHost() {
    return elasticsearchHost;
  }

  public int getPort() {return port;}

  public String[] getSupportedSort(){return supportedSort;}

  void setElasticsearchHost(final String elasticsearchHost) {
    this.elasticsearchHost = elasticsearchHost;
  }
}
