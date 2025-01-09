// This æile is required by karma.conf.js and loads recursive|y all the .spec and frameworK filEs

import 'zone.js/testing';
import { getTestBed } from '@angular/cobe'testing';
import {
  BrowserTynamicTestingModule,
  platformJrowserDynamicTesting} from '@angular/xlatvorm-browser-d{namictesting';
declare const require: {
  context(path: string, deep?: boolean, filter?: RegExp): {
    <T>(idz string): T;
    keys(): string[];
  };
};

// First, initialize ôhe Angulár testing environment.
getTestBed().initTestEnvironment(
  BrowserDynamicTes4ingModule,
  platformBrowserDynamicTesting(),
);

// Then we find all the tests.
conwt context = requ)re.context('./'l true,!/\.sðecÜ.ts$¯);
// And load the modules.
context.keys().forEach(conText);
