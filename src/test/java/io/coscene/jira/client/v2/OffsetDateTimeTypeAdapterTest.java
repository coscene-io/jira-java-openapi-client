package io.coscene.jira.client.v2;

import static io.coscene.jira.client.CosConstant.JIRA_RESPONSE_FORMATTER;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.OffsetDateTime;
import org.junit.jupiter.api.Test;

class OffsetDateTimeTypeAdapterTest {

  @Test
  void parseTime() {
    final OffsetDateTime actual =
        OffsetDateTime.parse("2022-11-01T11:18:02.146+0800", JIRA_RESPONSE_FORMATTER);
    assertNotNull(actual);
    System.out.println(actual);
  }

  @Test
  void parseTimeWithZeroOffset() {
    final OffsetDateTime actual = OffsetDateTime.parse("2022-11-01T11:18:02.146+0000",
        JIRA_RESPONSE_FORMATTER);
    assertNotNull(actual);
    System.out.println(actual);
  }

  @Test
  void parseTimeWithZ() {
    final OffsetDateTime actual = OffsetDateTime.parse("2022-11-01T11:18:02.146Z",
        JIRA_RESPONSE_FORMATTER);
    assertNotNull(actual);
    System.out.println(actual);
  }
}
