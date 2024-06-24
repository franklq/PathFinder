package com.aed.pathfinder.util;

import java.awt.Component;
import java.awt.Dimension;
import javax.swing.Icon;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;

/**
 *
 * @author Juan Romero Collazos
 */
public class CustomTreeCellRenderer extends DefaultTreeCellRenderer {
    private Icon rootIcon;

    public CustomTreeCellRenderer(Icon rootIcon) {
        this.rootIcon = rootIcon;
    }

    public void setRootIcon(Icon rootIcon) {
        this.rootIcon = rootIcon;
    }
    
    @Override
    public Component getTreeCellRendererComponent(JTree tree, Object value, boolean sel, boolean expanded, boolean leaf, int row, boolean hasFocus) {
        super.getTreeCellRendererComponent(tree, value, sel, expanded, leaf, row, hasFocus);
        
        DefaultMutableTreeNode node = (DefaultMutableTreeNode) value;
        
        if (tree.getModel().getRoot().equals(node)) setIcon(rootIcon);
        
        Dimension preferredSize = getPreferredSize();
        preferredSize.width = 150; // Set a specific width
        setPreferredSize(preferredSize);
        
        return this;
    }
    
}
