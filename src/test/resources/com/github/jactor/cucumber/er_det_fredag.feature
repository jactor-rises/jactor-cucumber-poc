# language: no
Egenskap: Er det fredag?
  Alle vil vite når helga starter

  Scenario: Søndag er ikke fredag
    Gitt dagen er søndag
    Når jeg spør om det er fredag
    Så er svaret "neida"

  Scenario: Fredag er fredag
    Gitt dagen er fredag
    Når jeg spør om det er fredag
    Så er svaret "jada, helg"

  Abstrakt Scenario: <dag> kan være fredag.
    Gitt dagen er "<dag>"
    Når jeg spør om det er fredag
    Så er svaret "<svar>"

    Eksempler:
      | dag       | svar        |
      | fredag    | jada, helg  |
      | noe annet | neida       |