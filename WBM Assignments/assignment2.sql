Create table TeamCenterdata(ItemNumber VARCHAR2(20), ItemVersion VARCHAR2(20), ContentName varchar2(100), ContentId VARCHAR2(20), ContentFilepath varchar2(100), Weight VARCHAR2(20), Createdby varchar2(20));

Insert INTO TeamCentreData values(1231,'A','ABC.pdf', 234, 'D:/files/', 'ABC.pdf', 'ashish');
insert into TeamCentreData values(1231,'A','ABC_Instruction.pdf',235,'D:/files/','ABC_Instruction.pdf','maneesh');
Insert INTO TeamCenterdata values('1231', 'A', 'ABC.prt', '236', 'ABC.prt', '12g', 'surya');
commit;
select * from teamcenterdata;
 
SELECT 
    '$$Document' AS DOCTYPE,
    ContentName AS Name,
    'wt.series.HarvardSeries' AS Series,
    'ABC' AS Container_Organisation_Name,
    'Product' AS ContainerType,
    'ABC_Product' AS Container,
    'ABC' AS Organization_Name,
    '24-11-2024 10:57' AS Created_Date,
    '24-11-2024 10:58' AS Modified_Date,
    ContentId AS ObjectNumber,
    '1' AS Batch_Id,
    'wt.doc.WTDocumentMaster' AS WBMSourceDescription,
    ContentId AS WBMSourceIdentifier
FROM TeamCenterdata;