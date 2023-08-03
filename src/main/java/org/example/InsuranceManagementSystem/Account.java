package org.example.InsuranceManagementSystem;

import java.util.ArrayList;

abstract class Account implements Comparable<Account> {
    private AuthenticationStatus authenticationStatus;
    private User user;
    private ArrayList<Insurance> insurances;

    enum AuthenticationStatus {
        SUCCESS, FAIL
    }

    abstract void addInsurance(Insurance insurance);
    abstract void removeInsurance(Insurance insurance);
    abstract void addUserAddress(Address address);
    abstract void removeUserAddress(Address address);

    final void showUserInfo() {
        System.out.println(authenticationStatus);
        System.out.println(user);
        System.out.println("insurances");
        for (int i =0; i<insurances.size();i++){
            System.out.print(insurances.get(i));
        }
    }

    boolean loginUser(String email, String password) throws InvalidAuthenticationException {
        if (this.user.getEmail().equals(email) && this.user.getPassword().equals(password)){
            return true;
        }
        else {
            throw new InvalidAuthenticationException();
        }
    }

    @Override
    public int compareTo(Account other) {
        // Implement comparison logic for sorting
        return 0;
    }

    @Override
    public int hashCode() {
        // Implement hashCode logic
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        // Implement equals logic
        return false;
    }

    private class InvalidAuthenticationException extends Throwable {
    }
}

