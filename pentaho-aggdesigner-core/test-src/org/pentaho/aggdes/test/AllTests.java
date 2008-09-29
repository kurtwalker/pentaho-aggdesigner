/*
 * This program is free software; you can redistribute it and/or modify it under the 
 * terms of the GNU General Public License, version 2 as published by the Free Software 
 * Foundation.
 *
 * You should have received a copy of the GNU General Public License along with this 
 * program; if not, you can obtain a copy at http://www.gnu.org/licenses/gpl-2.0.html 
 * or from the Free Software Foundation, Inc., 
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; 
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 *
 *
 * Copyright 2008 Pentaho Corporation.  All rights reserved. 
*/
package org.pentaho.aggdes.test;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

  public static Test suite() {
    TestSuite suite = new TestSuite("Test for org.pentaho.aggdes.test");
    //$JUnit-BEGIN$
    suite.addTestSuite(MondrianSchemaLoaderTest.class);
    suite.addTestSuite(AlgorithmImplTest.class);
    suite.addTestSuite(LatticeImplTest.class);
    suite.addTestSuite(OutputServiceImplTest.class);
    suite.addTestSuite(MonteCarloLatticeImplTest.class);
    suite.addTestSuite(AggDesignerMainTest.class);
    suite.addTestSuite(MondrianSchemaOutputTest.class);
    suite.addTestSuite(TableGeneratorTest.class);
    suite.addTestSuite(SsasToMondrianTest.class);
    suite.addTestSuite(SsasXmlaTest.class);
    suite.addTestSuite(ValidationMondrianSchemaLoaderTest.class);
    //$JUnit-END$
    return suite;
  }

}
