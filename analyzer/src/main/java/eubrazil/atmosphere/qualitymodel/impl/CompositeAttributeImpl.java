/**
 */
package eubrazil.atmosphere.qualitymodel.impl;

import eubrazil.atmosphere.qualitymodel.Attribute;
import eubrazil.atmosphere.qualitymodel.AttributeAggregationOperator;
import eubrazil.atmosphere.qualitymodel.CompositeAttribute;

import java.util.ArrayList;
import java.util.List;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eubrazil.atmosphere.qualitymodel.impl.CompositeAttributeImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link eubrazil.atmosphere.qualitymodel.impl.CompositeAttributeImpl#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositeAttributeImpl extends AttributeImpl implements CompositeAttribute {
	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected List<Attribute> children;

	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final AttributeAggregationOperator OPERATOR_EDEFAULT = AttributeAggregationOperator.NEUTRALITY;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected AttributeAggregationOperator operator = OPERATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Attribute> getChildren() {
		if (children == null) {
			children = new ArrayList<Attribute>();
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeAggregationOperator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(AttributeAggregationOperator newOperator) {
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}

} //CompositeAttributeImpl
