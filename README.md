# mdd4j

Code Generator for Model Driven Design.

## Goals

Simplifies enterprise/business application development by taking a model driven approach.

## Why code generator?

There're many application frameworks and libraries out there. Why should I care about code generator?

There're many aspects to concern when building enterprise application.

- UI for PC, mobile devices.
- Security, AAA
- Application service.
- data access/infrasture integration.
- ...

each has it's own tools specified to solve. 

however, we still have to code each of those aspects manually, and assemble those pieces together to make up the whole application.
they are no more than just different forms/representations of one common business model, and can be deduced from that model, maybe manually, or automatically.

## Problems in application development

- entities have many forms
-- persistence, value object in application service layer, value object in front end(PC browser, mobile devices, etc.) are the 'same' but in different forms of reprensentation.
- application constants. constants in business level, also have many forms of representation
-- javascript constants, java(or any other programming languages), rdbms...
each of those constants share the same name, have the same value, but in different forms.

