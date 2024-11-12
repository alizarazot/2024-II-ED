
package com.ufpso.secondmidterm;

import java.util.ArrayList;

public class Client {
   String document;

   enum Type {
      NATURAL,
      LEGAL,
   };
   Type type;

   String name;
   String email;
   String phone;

   int balance;

   public Client(String document, Type type, String name, String email, String phone, int balance) {
      this.document = document;
      this.type = type;
      this.name = name;
      this.email = email;
      this.phone = phone;
      this.balance = balance;
   }

   public String toString() {
      return String.format("<Client %s (%s)[%s] - %s: %s - $%d>", name,email, phone, type, document, balance );
   }

   public boolean equals(Client other) {
      return this.document.equals(other.document) &&
         this.type == other.type &&
         this.name.equals(other.name) &&
         this.email.equals(other.email) &&
         this.phone.equals(other.phone) &&
         this.balance == other.balance;
   }

   public static ArrayList<Client> loadClientsFromCSV(String csv) {
      ArrayList<Client> clients = new ArrayList<>();

      for (String line: csv.split("\n", 0)) {
         if (line.charAt(0) == ',') {
            //System.out.printf("Header: %s\n", line.substring(1, line.length()));
            continue;
         }

         String fields[] = line.split(",", -1);

         Type type = Type.LEGAL;
         if (fields[1].equalsIgnoreCase("Natural")) {
            type = Type.NATURAL;
         }

         clients.add(new Client(
            fields[0],
            type,
            fields[2],
            fields[3],
            fields[4],
            Integer.parseInt(fields[5])));
      }

      return clients;
   }
}
