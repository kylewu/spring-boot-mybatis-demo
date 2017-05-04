package com.wenbinwu.domain;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Subscriber implements Serializable {
  private static final long serialVersionUID = 1915802024276944320L;

  private String username;
  private String email;
  private List<Subscription> subscriptionList = new ArrayList<>();

}
