/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * InitGamePanel.java
 *
 * Created on Feb 24, 2012, 9:55:01 PM
 */
package client;

import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import models.Room;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;
import javax.swing.SwingUtilities;
import models.Cmd;
import models.IconListRenderer;


/**
 *
 * @author Administrator
 */
public class InitGamePanel extends javax.swing.JPanel {

    private CreateRoomDialog createRoomDialog;
    private DashBoardPanel dashBoardPanel;
    private HashMap<String, Room> rooms = new HashMap<>();
    
    private Room requestedRoom;

    /** Creates new form InitGamePanel */
    public InitGamePanel(DashBoardPanel dashBoardPanel) {
        initComponents();
        this.dashBoardPanel = dashBoardPanel;
        this.lstRooms.setCellRenderer(new IconListRenderer());

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstRooms = new javax.swing.JList();
        jPanel2 = new javax.swing.JPanel();
        btnNew = new javax.swing.JButton();
        btnFight = new javax.swing.JButton();
        btnObserve = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(500, 500));
        setMinimumSize(new java.awt.Dimension(500, 500));
        setPreferredSize(new java.awt.Dimension(500, 500));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setBorder(null);

        lstRooms.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 10), javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Rooms")));
        lstRooms.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lstRooms.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstRooms.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstRoomsMouseClicked(evt);
            }
        });
        lstRooms.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstRoomsValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstRooms);

        jPanel1.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(145, 300));

        btnNew.setBackground(new java.awt.Color(255, 255, 255));
        btnNew.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNew.setForeground(new java.awt.Color(0, 102, 51));
        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/notification_add.png"))); // NOI18N
        btnNew.setText("<html>New</html>");
        btnNew.setPreferredSize(new java.awt.Dimension(145, 57));
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        jPanel2.add(btnNew);

        btnFight.setBackground(new java.awt.Color(255, 255, 255));
        btnFight.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnFight.setForeground(new java.awt.Color(153, 0, 0));
        btnFight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/alien.png"))); // NOI18N
        btnFight.setText("<html>Fight!</html>");
        btnFight.setEnabled(false);
        btnFight.setPreferredSize(new java.awt.Dimension(145, 57));
        btnFight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFightActionPerformed(evt);
            }
        });
        jPanel2.add(btnFight);

        btnObserve.setBackground(new java.awt.Color(255, 255, 255));
        btnObserve.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnObserve.setForeground(new java.awt.Color(153, 0, 0));
        btnObserve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Search.png"))); // NOI18N
        btnObserve.setText("<html>Observe</html>");
        btnObserve.setEnabled(false);
        btnObserve.setPreferredSize(new java.awt.Dimension(145, 57));
        btnObserve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObserveActionPerformed(evt);
            }
        });
        jPanel2.add(btnObserve);

        add(jPanel2, java.awt.BorderLayout.WEST);
    }// </editor-fold>//GEN-END:initComponents

private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
    this.createRoomDialog = new CreateRoomDialog(null, true, this.dashBoardPanel);
    this.createRoomDialog.setVisible(true);
}//GEN-LAST:event_btnNewActionPerformed

    private void lstRoomsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstRoomsMouseClicked
    }//GEN-LAST:event_lstRoomsMouseClicked

    private void btnFightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFightActionPerformed
        requestedRoom = (Room) this.lstRooms.getSelectedValue();
        dashBoardPanel.setRoomName(requestedRoom.getName());
        Client client = dashBoardPanel.getClient();
        try {
            client.sendInt(Cmd.FIGHT_ROOM);            
            client.sendObject(requestedRoom);            
        } catch (IOException ex) {
            Logger.getLogger(InitGamePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnFightActionPerformed

    private void btnObserveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObserveActionPerformed
        requestedRoom = (Room) this.lstRooms.getSelectedValue();
        dashBoardPanel.setRoomName(requestedRoom.getName());
        Client client = dashBoardPanel.getClient();
        try {
            client.sendInt(Cmd.OBSERVE_ROOM);            
            client.sendObject(requestedRoom);            
        } catch (IOException ex) {
            Logger.getLogger(InitGamePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnObserveActionPerformed

    private void lstRoomsValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstRoomsValueChanged
        Room room = (Room) this.lstRooms.getSelectedValue();
        if (room == null) 
            changeState(0);
        else
            changeState(room.getStatus()); 
    }//GEN-LAST:event_lstRoomsValueChanged

    private void changeState(final int state) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                switch (state) {
                    case Room.WAITTING:
                        btnFight.setEnabled(true);
                        btnObserve.setEnabled(false);
                        break;
                    case Room.PLAYING:
                        btnFight.setEnabled(false);
                        btnObserve.setEnabled(true);
                        break;
                    default:
                        btnFight.setEnabled(false);
                        btnObserve.setEnabled(false);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFight;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnObserve;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList lstRooms;
    // End of variables declaration//GEN-END:variables

    private void reloadListRooms() {
        List<Room> listRoom = new ArrayList<>();
        for(Room room : this.rooms.values()){
            listRoom.add(room);
        }
        this.updateLstRooms(listRoom.toArray(new Room[0]));
//        this.updateLstRooms(rooms.toArray(new Room[0]));
//        Vector listItems = new Vector();
//        for (Room room : rooms) {
//            JPanel jp = new JPanel(new FlowLayout(FlowLayout.LEFT));
//            if(room.getRoomType() == Room.FIRE){
//                jp.add(new JLabel(new ImageIcon("src/images/fire.png")));
//            } else if(room.getRoomType() == Room.ICE){
//                jp.add(new JLabel(new ImageIcon("src/images/ice.png")));
//            }
//            StringBuilder msg = new StringBuilder("<html>")
//                    .append(room.getStatus()==Room.WAITTING?"<font size='3' color='green'>Waiting..</font>":"<font size='3' color='blue'>Playing..</font>")
//                    .append(" - <font size='4'><b>").append(room.getName()).append("</b></font></html>");
//            
//            jp.add(new JLabel(msg.toString()));
//            listItems.addElement(jp);
//        }
//        updateLstRooms(listItems);        
    }

  
    private void updateLstRooms(final Room[] rooms) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                lstRooms.setListData(rooms);
                lstRooms.revalidate();               
                
            }
        });
    }

    public void addNewRoom(Room room){
        this.rooms.put(room.getName(), room);
        reloadListRooms();
    }
    
    public void updateRoomStatus(String roomName, int status){
        Room room = this.rooms.get(roomName);
        if(room != null)
            room.setStatus(status);
        reloadListRooms();
    }
    
    public void setRooms(List<Room> rooms){
        for (Room room : rooms) {
            this.rooms.put(room.getName(), room);
        }
        reloadListRooms();
    }
    
    
    public void processResultRequestNewRoom(boolean bool) {
        if(this.createRoomDialog != null)
            this.createRoomDialog.processResultRequestNewRoom(bool);
    }

    public Room getRequestedRoom() {
        return requestedRoom;
    }

    public void removeRoom(String roomName) {
        this.rooms.remove(roomName);
        reloadListRooms();
    }
    
    

}