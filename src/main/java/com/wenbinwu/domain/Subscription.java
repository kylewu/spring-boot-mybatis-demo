package com.wenbinwu.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Subscription implements Serializable {
  private static final long serialVersionUID = 7854346509422974078L;

  private String channel;
  private String identifier;
  private Map<String, String> data = new HashMap<>();
}
