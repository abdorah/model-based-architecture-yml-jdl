# MODEL BASED SOFTWARE ENGINEERING PROJECT REPORT
- I
1. Explication de concept du projet
2. introduction a yaml
3. introduction jdl
4. Problematique :dsl
- II
5. architecture general du projet; les meta modèles
- III
6. realisation
7. mode du travail

## Concepts généraux du projet

>Dans cette partie introductive on va essayer de cerner les contours des concepts généraux du projet. L'intêret de cette partie est d'expliquer notre motivation pour ce sujet, de comprendre en quoi réside l'innovation dedans. Certes, le MDSE  est un concept qui excite depuis longtemps, et plusieurs méthodes et outils intéressants comme les DSL et EMF avaient un potentiel énorme. Sur la même longueur d'onde plusieurs format de représentation des données ont étaient adoptées largement par la communité, à voire YAML pour docker-compose, spring configuration, GROOVY pour gradle, etc. Mais, plusieurs technologies comme JDL adoptent des expressions verbeuses. De ce fait nous proposons pour JIHPSTER une transformation du modèle en YAML. Ce projet est potentiellement intêressant, puisque il permet de créer de nouvelle option qui permet des créer des applications ayants des structures un tant soit peu complexes.

1. **C'est quoi JHIPSTER**
<div>
<img style="float: right; width: 14%" src="https://upload.wikimedia.org/wikipedia/commons/5/56/JHipster-logo.png?uselang=fr">JHipster est un générateur d'application libre et open source utilisé pour développer rapidement des applications Web modernes en utilisant principalement le framework Spring. JHipster fournit des outils pour générer un projet avec côté serveur, une pile Java (à l'aide de Spring Boot) et côté client un frontal Web adaptatif.
</div>

2. **C'est quoi JDL**

Le JDL est un langage de domaine spécifique à JHipster où vous pouvez décrire toutes vos applications, déploiements, entités et leurs relations dans un seul fichier (ou plusieurs) avec une syntaxe conviviale. À la fin, on arrivera à créer un fichier JDL et sa visualisation UML.

La syntax JDL est structré sout format des propriétés, option, valeur.  C'est propriétés sont divisées en plusieurs catégories qui sont principalement:

- **Applications**: 

The application declaration is done as follows:
```jdl
application {
  config {
    <application option name> <application option value>
  }
  [entities <application entity list>]
  [<options>]
}
```
 * Application configuration keys/values are specified under config (which must be inside application)
 * There can be 0, 1 or any application option as you want (provided they are valid)
 * Entities that will be generated inside the application are listed via entities, this is the recommended way to generate entities in applications.
 * This can be omitted but generating entities inside the app would require doing it:
 * from another JDL file inside the app or with the CLI
* The entities keyword is optional: you can omit it, but every entity in the JDL file will be generated inside the application
Applications can have regular options (like dto or service), more information in the next section.

- **Entitiesfields**: 

The entity declaration is done as follows:
```
[<entity javadoc>]
[<entity annotation>*]
entity <entity name> [(<table name>)] {
  [<field javadoc>]
  [<field annotation>*]
  <field name> <field type> [<validation>*]
}
```
 * `<entity name>` the name of the entity,
 * `<field name>` the name of one field of the entity,
 * `<field type>` the JHipster supported type of the field,
and as an option:
 * `<entity javadoc>` the documentation of the entity,
 * `<entity annotation>` the options for the entity (see Options for a complete list of available options),
 * `<table name>` the database table name (if you want to specify something different that the name automatically computed from the entity name),
 * `<field javadoc>` the documentation of the field,
 * `<field annotation>` the options for the field,
 * `<validation>` the validations for the field.
- **Enums**: 
  Enumeration declaration is done as follows:
```
enum <enum name> {
  <ENUM KEY> [(<enum value>)]
}
```
 * Enumeration entry values are mandatory
 * + And uppercase keys must be used
 * Enumeration entry values are optional, and must be wrapped inside parenthesises
- **Relationships**:
Relationship declaration is done as follows:
```
relationship (OneToMany | ManyToOne | OneToOne | ManyToMany) {
  <from entity>[{<relationship name>[(<display field>)]}] to <to entity>[{<relationship name>[(<display field>)]}]+
}
```
`(OneToMany | ManyToOne| OneToOne | ManyToMany)` is the type of your relationship,
* `<from entity>` is the name of the entity owner of the relationship: the source,
* `<to entity> `is the name of the entity where the relationship goes to: the destination,
* `<relationship name>` is the name of the field having the other end as type,
* `<display field>` is the name of the field that should show up in select boxes (default: id),
* `required` whether the injected field is required.
* `with jpaDerivedIdentifier` whether `@MapsId` is used for the association (applicable only for one-to-one)
* And you can have more than one relationship body
* + See the Multiple relationship bodies section for more info!

- **Options**: 

In JHipster, you can specify options for your entities such as pagination or DTO. You can do the same with the JDL, either with annotations on the entity, or with the following syntax.
- **Deployments**: 

The deployment declaration is done as follows:

```
deployment {
  <deployment option name> <deployment option value>
}
```
Similar to applications, deployment declaration works by specifying option keys & values.

4. **Exemple de fichier JDL**

La partie suivante représente un exemple simple d'application composée en plusieur microservices. 
```jdl
application {
  config {
    baseName twitter,
    applicationType gateway,
    packageName com.myapp,
    authenticationType jwt,
    prodDatabaseType postgresql,
    clientFramework react
  }
  entities *
}

application {
  config {
    baseName tweetService,
    applicationType microservice,
    packageName com.myapp,
    authenticationType jwt,
    prodDatabaseType postgresql,
  }
  entities User, Tweet
}

application {
  config {
    baseName searchService,
    applicationType microservice,
    packageName com.myapp,
    authenticationType jwt,
    prodDatabaseType postgresql
  }
  entities User, Tweet
}

application {
  config {
    baseName userTimeLineService,
    applicationType microservice,
    packageName com.myapp,
    authenticationType jwt,
    prodDatabaseType postgresql
  }
  entities User, Tweet
}

application {
  config {
    baseName homeTimeLineService,
    applicationType microservice,
    packageName com.myapp,
    authenticationType jwt,
    prodDatabaseType postgresql
  }
  entities User, Tweet
}

application {
  config {
    baseName socialGraphService,
    applicationType microservice,
    packageName com.myapp,
    authenticationType jwt,
    prodDatabaseType postgresql
  }
  entities User
}

application {
  config {
    baseName directMessagesService,
    applicationType microservice,
    packageName com.myapp,
    authenticationType jwt,
    prodDatabaseType postgresql
  }
  entities User, Message
}

entity Comment {
	id Long required,
    content String required,
    userId Long required
}

entity Tweet {
	id Long required,
    content String required
}

entity User {
	id Long required,
    userName String required,
    fullName String required
}

entity Message {
	id Long required,
    content String required,
    senderId Long required,
    receverId Long required
}

relationship OneToMany {
  User to Message,
  Tweet to Comment
}

relationship ManyToMany {
  User to User,
  User to Tweet
}
```

4. **C'est quoi YAML**

YAML est une format de représentation de données simple inspirée de XML, JSON et python. Il permet de créer des fichiers de configuration. L'idée de YAML est que presque toute donnée peut être représentée par combinaison de listes, et clé-valeur. La syntaxe du flux YAML est relativement simple, efficace, moins verbeuse que du XML.

5. **YAML 2 JDL**

C'est quoi une DSL? Domaine specific languages, sont les languages  dont les spécifications sont conçues pour répondre aux contraintes d’un domaine d'application précis. Il s'oppose conceptuellement aux langages de programmation classiques (ou généralistes) comme Java ou C, qui tendent à traiter un ensemble de domaines.

D'aprés le papier de recherche de Jean Bézivin, Hugo Bruneliere, Frédéric Jouault, et Ivan Kurtev intitulé "Model engineering support for tool interoperability":
> In our work we have a specific bias to using "agile metamodeling" with small metamodels. This contradicts many mainstream proposals that use large and predefined "one size fits all" metamodels like UML 2.0. We need more experiments to assess the advantages and drawbacks of each of these approaches named below "agile modeling" and "monolithic modeling". 

D'aprés cette citation, nous avons pensé que ça serait trés interessant de réaliser un DSL pour JDL en s'inspirant de YAML.
