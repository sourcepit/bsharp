/*
 * Copyright 2015 Bernd Vogt and others.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.sourcepit.java8;

import static org.junit.Assert.fail;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;

public class Java8ParserTest {

   @Test
   public void testClassInstanceCreationExpression() {
      assertValidPrimary("new Foo()");
      assertValidPrimary("new Foo().new Bar()");
   }
   @Test
   public void testFieldAccess() {
      assertValidPrimary("new Foo().foo");
      assertValidPrimary("super.foo");
      assertValidPrimary("Foo.super.bar");
   }
   private static ParseTree assertValidPrimary(String in) {
      Java8Lexer lexer = new Java8Lexer(new ANTLRInputStream(in));
      Java8Parser parser = new Java8Parser(new CommonTokenStream(lexer));
      ParseTree parseTree = parser.primary();
      parseTree.accept(new AbstractParseTreeVisitor<Void>() {
         @Override
         public Void visitErrorNode(ErrorNode node) {
            fail();
            return null;
         }
      });
      return parseTree;
   }
}
