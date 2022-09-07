<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:xs="http://www.w3.org/2001/XMLSchema"
                exclude-result-prefixes="xs"
                version="2.0">

    <xsl:output method="xml" indent="yes"/>
    <xsl:strip-space elements="*"/>

    <xsl:template match="/">
        <person>
            <xsl:attribute name="name">
                <xsl:value-of select="request" disable-output-escaping="yes"/>
            </xsl:attribute>
        </person>
<!--        <xsl:copy>-->
<!--            <xsl:apply-templates select="*" />-->
<!--            <xsl:value-of select="text()" disable-output-escaping="yes"/>-->
<!--        </xsl:copy>-->
    </xsl:template>

</xsl:stylesheet>