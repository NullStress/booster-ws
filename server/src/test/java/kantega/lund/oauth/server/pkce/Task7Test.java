package kantega.lund.oauth.server.pkce;

import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class Task7Test {

    @Test
    void transform() {
        String codeChallenge = "IQ9Ow5JE6DhDbFgptenQRViIE3JiUMjEgnfvIIY1ZFw";
        assertEquals(codeChallenge, CodeChallengeMethod.S256.transform("TKl-HjfhvQkhEmCzJ6csmAsg6ROZC0SSbW05NRlFCltNMMFnKlZq6myomprDSqoztF4oW8VTnVgX2NTrBC6Gu8N5O_yPKCR-OFhZ-QS522Dqrf9h_JbK9DIe7zMLmKFG"));

        codeChallenge = "4tYqR-lQDfkW3Q0SAFLhbmiFCEBXVjehinnb5D7_i40";
        assertEquals(codeChallenge,CodeChallengeMethod.S256.transform("NQrZx_6w9Ir-zDGEbVHyrshKtC-sROW1j-q_SnF9PgSCTuFlsg0n_cup2Os9cbNT0pWJg3sziyDwbu3CUSEb4bFqBVgC9isd9CZ54uoe879VKVinPlfTsZ3sfxbbeYV0"));
    }


}