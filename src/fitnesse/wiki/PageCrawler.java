// Copyright (C) 2003-2009 by Object Mentor, Inc. All rights reserved.
// Released under the terms of the CPL Common Public License version 1.0.
package fitnesse.wiki;

import fitnesse.components.TraversalListener;

import java.util.List;

public interface PageCrawler {
  WikiPage getPage(WikiPagePath path);

  WikiPage getPage(WikiPagePath path, PageCrawlerDeadEndStrategy deadEndStrategy);

  boolean pageExists(WikiPagePath path);

  WikiPagePath getFullPathOfChild(WikiPagePath childPath);

  WikiPagePath getFullPath();

  String getRelativeName(WikiPage page);

  // Should become a property of WIkiPage
  boolean isRoot();

  WikiPage getRoot();

  void traverse(TraversalListener<? super WikiPage> callback);

  WikiPage getSiblingPage(WikiPagePath pathRelativeToSibling);

  WikiPage findAncestorWithName(String name);

  WikiPage getClosestInheritedPage(WikiPage context, String pageName);

  // TODO: make these use TraversalListener
  List<WikiPage> getAllUncles(String uncleName);

  List<WikiPage> getAncestorsOf();

  List<WikiPage> getAncestorsStartingWith();
}