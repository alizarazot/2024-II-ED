
package com.ufpso.secondmidterm;

import java.util.ArrayList;

class LinkedList {
   LinkedList right;
   Client value;

   public LinkedList(Client value) {
      this.value = value;
   }

   public void addEnd(Client value) {
      LinkedList pointer = this;
      while (pointer.right != null) {
         pointer = pointer.right;
      }

      pointer.right = new LinkedList(value);
   }

   /* The new root is the value returned. */
   public LinkedList removeTop() {
      return this.right;
   }

   public LinkedList peekTop() {
      return this;
   }

   public ArrayList<Client> entries() {
      ArrayList<Client> list = new ArrayList<>();

      LinkedList pointer = this;
      while (pointer != null) {
         list.add(pointer.value);
         pointer = pointer.right;
      }

      return list;
   }
}

public class Queue {
   LinkedList list;

   public Queue() {
      this.list = null;
   }

   public int distanceOf(Client client) {
      if (this.list == null) {
         return -1;
      }

      int distance = 0;

      LinkedList pointer = this.list.peekTop();
      for (;;) {
         if (pointer == null) {
            return -1;
         }

         if (client.equals(pointer.value)) {
            return distance;
         }

         distance++;
         pointer = pointer.right;
      }
   }

   public Client peek() {
      if (this.list == null) {
         return null;
      }

      return this.list.peekTop().value; 
   }

   public void add(Client value) {
      if (this.list == null) {
         this.list = new LinkedList(value);
         return;
      }

      this.list.addEnd(value);
   }

   public Client remove() {
      if (this.list == null) {
         return null;
      }

      Client client = this.peek();
      this.list = this.list.removeTop();

      return client;
   }

   public ArrayList<Client> entries() {
      if (this.list == null) {
         return new ArrayList<Client>();
      }

      return this.list.entries();
   }
}
