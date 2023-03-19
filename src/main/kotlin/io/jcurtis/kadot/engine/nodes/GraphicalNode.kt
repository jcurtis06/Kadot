package io.jcurtis.kadot.engine.nodes

import java.awt.Graphics2D
import java.awt.image.ImageObserver

abstract class GraphicalNode(type: NodeType, name: String) : Node(type, name) {
    abstract fun draw(g: Graphics2D, observer: ImageObserver)
}