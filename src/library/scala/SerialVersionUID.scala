/*                     __                                               *\
**     ________ ___   / /  ___     Scala API                            **
**    / __/ __// _ | / /  / _ |    (c) 2002-2006, LAMP/EPFL             **
**  __\ \/ /__/ __ |/ /__/ __ |                                         **
** /____/\___/_/ |_/____/_/ | |                                         **
**                          |/                                          **
*/

// $Id$


package scala;


/**
 * Attribute for specifying the static SerialVersionUID field
 * of a serializable class
 */
case class SerialVersionUID(uid: Long) extends Attribute {}
