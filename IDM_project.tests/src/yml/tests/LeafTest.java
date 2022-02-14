/**
 */
package yml.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import yml.Leaf;
import yml.YmlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Leaf</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LeafTest extends TestCase {

	/**
	 * The fixture for this Leaf test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Leaf fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LeafTest.class);
	}

	/**
	 * Constructs a new Leaf test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeafTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Leaf test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Leaf fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Leaf test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Leaf getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(YmlFactory.eINSTANCE.createLeaf());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //LeafTest
