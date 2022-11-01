package io.coscene.jira.client;

import java.time.format.DateTimeFormatter;

/**
 * @author spencercjh
 */
public final class CosConstant {
  public static final DateTimeFormatter JIRA_RESPONSE_FORMATTER =
      DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSX");
}
