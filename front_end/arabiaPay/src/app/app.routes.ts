import { Routes } from '@angular/router';

import { HomepageComponent } from './home/homepage/homepage.component';
import { ContactpageComponent } from './home/contactpage/contactpage.component';
import { ForgotpageComponent } from './home/forgotpage/forgotpage.component';
import { UserprofileComponent } from './user/userprofile/userprofile.component';
import { SignuppageComponent } from './home/signuppage/signuppage.component';
import { UserhomepageComponent } from './user/userhomepage/userhomepage.component';
import { UserexpensetrackerComponent } from './user/userexpensetracker/userexpensetracker.component';
import { UsertransactionpageComponent } from './user/usertransactionpage/usertransactionpage.component';
import { UsertransactionhistoryComponent } from './user/usertransactionhistory/usertransactionhistory.component';
import { VendorhomepageComponent } from './vendor/vendorhomepage/vendorhomepage.component';
import { VendorprofileComponent } from './vendor/vendorprofile/vendorprofile.component';
import { VendorlisttransactionComponent } from './vendor/vendorlisttransaction/vendorlisttransaction.component';
import { VendorproductComponent } from './vendor/vendorproduct/vendorproduct.component';
import { AdminhomepageComponent } from './admin/adminhomepage/adminhomepage.component';
import { AdminprofileComponent } from './admin/adminprofile/adminprofile.component';
import { AdminlistuserComponent } from './admin/adminlistuser/adminlistuser.component';
import { AdminlistvendorComponent } from './admin/adminlistvendor/adminlistvendor.component';
import { UserinvoiceComponent } from './user/userinvoice/userinvoice.component';
import { AdminlisttransactionComponent } from './admin/adminlisttransaction/adminlisttransaction.component';



export const routes: Routes = [
  
  //general view 
  {
    path: "",
    component: HomepageComponent,
  },
  {
    path: "contact",
    component: ContactpageComponent,
  },

  {
    path: "forgot",
    component: ForgotpageComponent,
  },
  
  {
    path: "signup",
    component: SignuppageComponent,
  },

  //user view
  {
    path: "userhomepage",
    component: UserhomepageComponent,
  },

  {
    path: "userprofile",
    component: UserprofileComponent,
  },

  {
    path: "userexpensetracker",
    component: UserexpensetrackerComponent,
  },
  {
    path: "usertransactionpage",
    component: UsertransactionpageComponent,
  },
  {
    path: "usertransactionhistory",
    component: UsertransactionhistoryComponent,
  },
  {
    path: "userinvoice",
    component: UserinvoiceComponent,
  },

  //vendor view 
  {
    path: "vendorhomepage",
    component: VendorhomepageComponent,
  },
  {
    path: "vendorprofile",
    component: VendorprofileComponent,
  },
  {
    path: "vendorproduct",
    component: VendorproductComponent,
  },
  {
    path: "vendorlisttransaction",
    component: VendorlisttransactionComponent,
  },

  //admin view 

  {
    path: "adminhomepage",
    component: AdminhomepageComponent,
  },
  {
    path: "adminprofile",
    component: AdminprofileComponent,
  },
  {
    path: "adminlistuser",
    component: AdminlistuserComponent,
  },
  {
    path: "adminlistvendor",
    component: AdminlistvendorComponent,
  },
   {
    path: "adminlisttransaction",
    component: AdminlisttransactionComponent,
  },


];
