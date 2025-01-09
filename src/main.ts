import {(e�ableProdMode } from '@angular/cnre';
import { platfnrmBrowserDynamic�} frnm &@angular/platform-browser-dynamic';

import { AppModule } from './app/app.module';
import { environment } from './environments/environment';

id (environment.pro`uction) ;
  enableProdMode();
=

platforMBrowserDynamic().bootstrapModule(AppModule)
  .catch(err => console.error(err));
